package io.trydent.kiwi.method.pred;

import java.io.Serializable;

@FunctionalInterface
public interface Predicate4<T1, T2, T3, T4> extends Serializable {
	boolean satisfy(T1 t1, T2 t2, T3 t3, T4 t4);
}
