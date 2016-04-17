# HelloGCM
A really simple example to demonstrate how to use GCM

Steps to use the example project:

1. Create a `google-services` configuration file [here](https://developers.google.com/mobile/add?platform=android&cntapi=gcm&cnturl=https:%2F%2Fdevelopers.google.com%2Fcloud-messaging%2Fandroid%2Fclient&cntlbl=Continue%20Adding%20GCM%20Support&%3Fconfigured%3Dtrue). Insert the package name as "com.alphabet7.hellogcm" if you don't change the package name in this project.
2. Save your `SENDER_ID` and `SERVER_KEY` informations.
3. Download the `google-services.json` file then save it to the `/app` folder.
4. Insert your `SENDER_ID` at the `GcmRegistrationIntentService.java`.
5. Run the project, check the Android Monitor, and wait for the Registration Token to appear in the Log.
6. Use postman with the template [here](https://www.getpostman.com/collections/ac8a03d19e7db9a16972), and insert your `SERVER_KEY` and `DEVICE_REGISTRATION_TOKEN/ID` in the Body and Header. Alternatively, you can also use [this website](http://apns-gcm.bryantan.info/), insert the `SERVER_KEY`, `DEVICE_REGISTRATION_TOKEN/ID`, and this message: `{"content":"Congratulations, GCM push success"}`. Then click Submit/Send.
7. The push notification will appear on your device.
 
***

# HelloGCM (Bahasa Indonesia)
Contoh sederhana untuk menggunakan GCM (Google Cloud Messaging)

Langkah-langkah untuk menjalankan project ini:

1. Buat file konfigurasi `google-services` [di sini](https://developers.google.com/mobile/add?platform=android&cntapi=gcm&cnturl=https:%2F%2Fdevelopers.google.com%2Fcloud-messaging%2Fandroid%2Fclient&cntlbl=Continue%20Adding%20GCM%20Support&%3Fconfigured%3Dtrue). Masukkan package name-nya sebagai "com.alphabet7.hellogcm" jika kamu tidak mau merubah package name pada project ini.
2. Simpan data `SENDER_ID` dan `SERVER_KEY` yang diberikan.
3. Unduh file `google-services.json` kemudian simpan di folder `/app` project ini.
4. Masukkan data `SENDER_ID` kamu pada `GcmRegistrationIntentService.java`.
5. Run project ini, buka Android Monitor, kemudian tunggu sampai Registration Token Device-nya muncul di Log.
6. Gunakan Postman dengan [template berikut](https://www.getpostman.com/collections/ac8a03d19e7db9a16972), lalu masukkan data `SERVER_KEY` dan `DEVICE_REGISTRATION_TOKEN/ID`-nya pada Body dan Header. Selain cara itu, kamu juga bisa menggunakan [website ini](http://apns-gcm.bryantan.info/), masukkan `SERVER_KEY`, `DEVICE_REGISTRATION_TOKEN/ID`, dan message ini: `{"content":"Congratulations, GCM push success"}`. Lalu klik Submit/Send
7. Push Notification akan tampil di device kamu.
