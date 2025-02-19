package agents.supervisors;

import agents.BasicAgent;

public class SupervisorAgent extends BasicAgent {
    // управляет другими агентами для выполнения заказов
    // посетителей. Запускает процесс создания нового заказа.
    // На основании запроса от агента посетителя создает
    // агента заказа, а после выполнения заказа контролирует
    // уничтожение агента заказа. Взаимодействует с агентом
    // склада. «Приказывает» ему зарезервировать для каждого
    // экземпляра заказанного блюда (напитка) из определенного
    // заказа заданный объем конкретного продукта. Создает и
    // уничтожает всех прочих агентов.
}
