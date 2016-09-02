package io.trydent.kiwi.method.proc;

import java.io.Serializable;

@FunctionalInterface
public interface Procedure6<T1, T2, T3, T4, T5, T6> extends Serializable {
	void accept(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6);
}
