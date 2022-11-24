public class Main {
    public static void main(String[] args) {
        /*Класстар
1.     Animal(абстракт класс) - String name , int speed, AnimalType animalType;
2.     Eagle(sub класс) ;
3.     Horse(sub класс);
5.     AnimalType(Enum) - DOMESTIC_ANIMAL, BIRD;
6.     Transport(абстракт класс) - String name, int year, TransportType transportType;
8.     Bus(sub класс);
9.     Helicopter(sub класс);
10.   TransportType(Enum) - ROAD_TRANSPORT, AIR_TRANSPORT;
11.   Person(класс) - String name, int age, Animal [] animal, Transport [] transport;
12.   AnimalInterface(interface) - void run(), void eat(String food);
13.   Flyable(interface) - void fly();
14.   TransportInterface (interface) - void fuelConsumption(String fuel, int litr);
Методдор
1.     run() методу кайсыл жаныбар канча ылдамдыкта чуркай аларын корсотсун;
2.     eat() методу кайсыл жаныбар кандай тамак жейт экенин чыгарсын;
4.     fly() методу кайсыл жаныбар жана транспорт уча турганын корсотсун;
5.     fuelConsumption() методу кайсыл транспорт кандай жана канча куйуучу май сарптайт чыгарсын;
Результат
1.     Мейнге 3 метод тузунуз
2.     1-метод: method1(Animal[] animals, Transport[]transports,String name);
        3 Person тузунуз: Asan, Uson, Adyl
        Asan: 1 Horse, 1 Eagle, 2 Bus, 1 Helicopter
        Uson: 2 Horse, 1 Bus, 1 Helicopter
        Adyl: 2 Eagle, 1 Helicopter
   Консольдон кимдин аты жазылса ошого таандык маалымат чыксын ;
3.     2-метод: method2(Animal[] animals);
       Жанбарларга оздоруно тийиштуу методдорун консольго чыгарыныз
       2 массив тузуп(Eagle,Horse), ар бир жаныбарды animals массивинен алып оздорунун массивине салып, консольго чыгарыныз.
4.     3-метод: method3(Transport[] transports);
       Транспортторго оздоруно тийиштуу методдорун консольго чыгарыныз
        2 массив тузуп(Bus,Helicopter), ар бир транспортту transports массивинен алып оздорунун массивине салып, консольго чыгарыныз.*/

        Animal [] animal = {
                new Horse ("Ak-kula",8471,AnimalType.DOMESTIC_ANIMAL),
                new Eagle("Burkut",475,AnimalType.BIRD),
        };
        Transport [] transports = {
                new Bus("Avtobus", 2021, TransportType.ROAD_TRANSPORT),
                new Bus("Avtobus2", 2022, TransportType.ROAD_TRANSPORT),
                new Helicopter("Vertalot1", 2021, TransportType.AIR_TRANSPORT)
        };


        Animal [] animals = {
                new Horse ("Kuluk-At",5543,AnimalType.DOMESTIC_ANIMAL),
                new Horse ("Kuluk-At1",5643,AnimalType.DOMESTIC_ANIMAL),

        };
        Transport [] transports1 = {
                new Bus("Avtobus3", 1996, TransportType.ROAD_TRANSPORT),
                new Helicopter("vertoletUson", 1995, TransportType.AIR_TRANSPORT),
        };


        Eagle [] eagles={
                new Eagle("Burkut2",556,AnimalType.BIRD),
                new Eagle("Burkut3",2222,AnimalType.BIRD)
        };
        Helicopter [] helicopters = { new Helicopter("Vertalot2", 2020, TransportType.AIR_TRANSPORT)};





        Person asan = new Person("Asan", 27, animal, transports );
        Person uson = new Person("Uson", 19, animals, transports1);
        Person adyl =  new Person("Adyl", 25, eagles, helicopters);
    }

}