phones = ["8001576398", "9634567845", "7894561212", "9638527414", "7884551212", "4852631973", "7531597496", "1115557983", "1975235481"]
names = ["Kate", "James", "Mike", "Franklin", "Steve", "Otis", "Maeve", "Alex", "Justin"]
works = ["Developer", "Painter", "Tester", "Engeneer", "Spaceman", "Mechanic", "Joker", "Boss", "Engeneer"]
dates = ["1994-05-14", "1994-05-12", "1994-05-11", "1994-05-31", "1994-05-04", "1994-05-29", "1994-05-15", "1994-05-27", "1994-07-23"]
departs = ["L1", "L5", "E1", "B2", "A1", "F0", "S", "E", "X"]
for i in range(9):
    print(f'''         <tr>
            <td>
                <input type="checkbox">
            </td>
            <td>
                <p class="phone">
                    <a href=”tel:+7{phones[i]}”>+7({phones[i][:3]}){phones[i][3:6]}-{phones[i][6:8]}-{phones[i][8:]}</a>
                </p>
            </td>
            <td>{names[i]}</td>
            <td>{works[i]}</td>
            <td>
                <time>{dates[i]}</time>
            </td>
            <td>{departs[i]}</td>
            <td>
                <a href="localhost">Удалить</a>
            </td>
        </tr>''')