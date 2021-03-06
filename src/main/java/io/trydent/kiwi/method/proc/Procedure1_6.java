package io.trydent.kiwi.method.proc;

import io.trydent.kiwi.tuple.Tuple6;

import java.io.Serializable;

@FunctionalInterface
public interface Procedure1_6<T, R1, R2, R3, R4, R5, R6> extends Serializable {
	Tuple6<R1, R2, R3, R4, R5, R6> accept(T t);
}
