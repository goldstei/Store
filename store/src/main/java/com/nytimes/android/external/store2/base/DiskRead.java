package com.nytimes.android.external.store2.base;

import javax.annotation.Nonnull;

import io.reactivex.Observable;


public interface DiskRead<Raw, Key> {
    @Nonnull
    Observable<Raw> read(@Nonnull Key key);
}