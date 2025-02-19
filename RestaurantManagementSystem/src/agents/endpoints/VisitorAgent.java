package agents.endpoints;

import agents.BasicAgent;

public class VisitorAgent extends BasicAgent {
    //
    // Запрашивает у управляющего агента текущее актуальное меню, содержащее исключительно блюда и напитки, которые могут быть приготовлены за заданное нормативное время (например, максимум за 20 мин) с указанием необходимого для приготовления каждого блюда / напитка времени. Обращается к управляющему агенту с запросом на формирование заказа из выбранных посетителем блюд и / или напитков.
    // Это агент, который взаимодействует непосредственно с клиентом. Он может быть оформлен в виде приложения для мобильного телефона, сайта, веб-страницы терминала ресторана и т. д. (эта часть системы не автоматизируется). Также он просит управляющего агента создать агентов заказа и взаимодействует с ними, чтобы получить и затем предоставить посетителю время ожидания заказа. Чтобы иметь возможность отключить недоступные пункты меню, этот агент может, например, пассивно ожидать соответствующих уведомлений от других агентов.
    //Варианты возможного поведения агента:
    //1. Добавить выбранный элемент меню (блюдо или напиток) в заказ.
    //2. Удалить выбранный элемент меню (блюдо или напиток) из заказа.
    //3. Отключить (сделать неактивным) пункт меню из-за недоступности необходимого ресурса.
    //4. Включить (сделать активным) ранее отключенный пункт меню из-за появления необходимого ресурса.
    //5. «Попросить» управляющего агента создать экземпляр агента заказа.
    //6. Отменить заказ, при этом уничтожается соответствующий агент заказа.
    //7. Получить обновленную информацию о предполагаемом времени ожидания заказа от агента заказа.
    //
}
