# UAS-PBO2_TIF-K23b_23552011211

1. Inheritance (Pewarisan)
Inheritance digunakan ketika sebuah class mewarisi atribut dan method dari class lain.

Implementasi:
Kelas Dokter dan Apoteker merupakan subclass dari class abstrak TenagaMedis.
TenagaMedis mendefinisikan struktur umum (seperti method verifikasiResep()), yang kemudian diimplementasikan berbeda oleh Dokter dan Apoteker.

<img width="857" height="515" alt="Screenshot 2025-07-26 004806" src="https://github.com/user-attachments/assets/a7bb746f-8f38-43a6-89f3-87d4bf39ed39" />

2. Polymorphism (Polimorfisme)
Polymorphism memungkinkan objek bertindak sebagai instance dari superclass-nya

Implementasi:
verifikasiResep() dipanggil melalui referensi TenagaMedis, tetapi saat runtime akan menjalankan implementasi sesuai objek aslinya (Dokter atau Apoteker).

<img width="915" height="155" alt="image" src="https://github.com/user-attachments/assets/3758cec8-f3c6-488e-9945-eb1969c5a415" />

3. Encapsulation (Enkapsulasi)
Encapsulation adalah menyembunyikan detail internal suatu objek dari luar dan hanya menyediakan akses melalui method publik.

 Implementasi:
Pada class Pasien, atribut seperti id, nama, dan umur disimpan secara private, dan diakses menggunakan getter dan setter.

<img width="805" height="422" alt="image" src="https://github.com/user-attachments/assets/4a9a1106-25f9-4086-b581-e8c28904b577" />

 4. Abstraction (Abstraksi)
Abstraction adalah menyembunyikan detail implementasi dan hanya menampilkan fungsionalitas utama kepada pengguna.

Implementasi:
Kelas TenagaMedis adalah abstract class, sehingga tidak bisa dibuat objeknya langsung.
Hanya method abstrak seperti verifikasiResep() yang dideklarasikan di kelas tersebut, implementasinya diserahkan ke subclass (Dokter, Apoteker).

<img width="637" height="99" alt="image" src="https://github.com/user-attachments/assets/ec368fdb-fa65-4708-b1f8-25317fc6e42a" />

Kesimpulan:
Program Kasir Apotek kamu telah menerapkan keempat prinsip OOP dengan baik:

| Prinsip       | Contoh Implementasi                                    |
| ------------- | ------------------------------------------------------ |
| Inheritance   | `Dokter`, `Apoteker` extends `TenagaMedis`             |
| Polymorphism  | `TenagaMedis verifikasiResep()` → dinamis saat runtime |
| Encapsulation | Atribut `Pasien` disembunyikan dengan getter/setter    |
| Abstraction   | `TenagaMedis` sebagai kelas abstrak                    |

dan untuk java fx nya tidak bisa running karena ada kesalahan
saya minta maaf sebelumnya pak 🙏🏼🙏🏼🙏🏼
