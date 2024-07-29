package br.com.frks.service;

public interface IConverteDados {
    <T> T obterDados (String json, Class<T> classe);
}
