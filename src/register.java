public class Register {
private Apartment[] apartments;
private int n;
public Register(int maxSize) {
apartments = new Apartment[maxSize];
n = 0;
}
public void add(Apartment a) {
apartments[n] = a;
n++;
}
public void remove(int id) {
int i = 0;
while (i < n && apartments[i].getId() != id) {
i++;
}
if (i < n) {
apartments[i] = apartments[n - 1];
n--;
}
}
public int[] countApartments() {
int max = 0;
for (int i = 0; i < n; i++) {
if (apartments[i].getNbrOfRooms() > max) {
max = apartments[i].getNbrOfRooms();
}
}
int[] count = new int[max];
for (int i = 0; i < n; i++) {
int rooms = apartments[i].getNbrOfRooms();
if (rooms > 0) {
count[rooms - 1]++;
}
}
return count;
}
}
