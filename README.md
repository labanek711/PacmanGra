# PacmanGra

Paweł Łabanowski grupa L2

Poniższy projekt  został skonstruowany na potrzeby zaliczenia lab2.
# Ogólna prezentacja gry
![PacmanGra](pacmangra.PNG)
# Krótki opis
Trochę trudności sprawiło mi zmienienie poziomu, ale po przeanalizowaniu calego kodu jakoś poszło.
Dla urozmaicenia rozgrywki dodałem muzykę (klasa muzyka) ze starego pacmana połączoną z darmowym soundtrackiem starej retro gry gdzie funkcje wywołuje bezpośrednio w mainie.
Dodałem też wybór za pomocą przycisku "skórki" pacmana i duchów- stworzylem funkcje ktora przechowuje nasze skórki-loadimages2. Stworzylem funkcje initgame2 i za pomoca S- podstawowo startujemy grę ze starymi skórkami ale za to klikajac D- startujemy grę z nowymi skórkami. Na koniec dodałem licznik czasu - czas, który liczy nam nasz czas naszej partii. Timer startuje bezposredniu po wejsciu do gry i resetuje się co nową rundę. Timer sprawdza czy jesteśmy w grze w funkcji doDrawing, gdzie również wyrysowuje nam drawTime. W folderze screeny mamy 2 zdjecia, przed i po zmianach poziomu.
