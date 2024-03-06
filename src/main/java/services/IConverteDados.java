package services;

public interface IConverteDados {
    <T> T ConverteDados(String json, Class<T> classe);
}
