package io.mulberry.ms.hong.parsers;

public abstract class AbstractMediaParser implements IMediaParser{
    final String path;

    public AbstractMediaParser(String path) {
        this.path = path;
    }
}
