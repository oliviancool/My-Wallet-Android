/*
 * Copyright 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.bitcoin.utils;

import java.util.Collection;

/**
 * A utility class that makes it easier to run lists of event listeners that are allowed to
 * delete themselves during their execution. Event listeners are locked during execution. <p>
 *
 * Use like this:<p>
 *
 * <tt><pre>
 * final Foo myself = this;
 * final Bar change = ...;
 * EventListenerInvoker.invoke(myEventListeners, new EventListenerInvoker<FooEventListener, Void>() {
 *     public void invoke(FooEventListener listener) {
 *       listener.onSomethingChanged(myself, change);
 *     }
 * });
 * </pre></tt>
 */
public abstract class EventListenerInvoker<E> {
	public abstract void invoke(E listener);

	public static <E> void invoke(Collection<E> listeners,
			EventListenerInvoker<E> invoker) {
		for (E l : listeners) {
			synchronized (l) {
				invoker.invoke(l);
			}
		}
	}
}
