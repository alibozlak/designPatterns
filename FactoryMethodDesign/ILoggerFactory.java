package FactoryMethodDesign;

/**
 * LoggerFactory classı çıplak kalmasın diye oluşturulan interface
 */
public interface ILoggerFactory {
    Logger createLogger();
}
