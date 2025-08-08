🔐 JavaFX File Encryption & Decryption Tool

A simple JavaFX desktop application that lets you encrypt and decrypt text files using a basic character-shifting algorithm.


✨ Features
- Browse & Select File – Choose any file from your system using a file picker.
- Encrypt File – Shifts each character by -4 in the ASCII table and overwrites the file with encrypted text.
- Decrypt File – Shifts each character by +4 to restore the original content, overwrites the file, and automatically opens it.
- User-Friendly UI – Built using JavaFX with a minimal layout.


📂 How It Works
1. Browse – Click browser... to select a file.
2. Encryption – Click encryption to apply the shift-based encryption.
3. Decryption – Click decryption to restore the original file and open it automatically.


🛠️ Technologies Used
- Java – Core programming language
- JavaFX – GUI framework
- AWT Desktop API – Opens files after decryption
- File I/O – FileInputStream, FileWriter, and FileChooser for file handling


📦 Installation & Setup
1. Install Java JDK 8 or later.
2. Install JavaFX SDK (if not included in your JDK).
3. Clone this repository:
   git clone https://github.com//Rajaprabu9488//javafx_encryption_application//
4. Compile and run:
   javac encryptor.java
   java encryptor


📸 Screenshot
<img width="1349" height="706" alt="image" src="https://github.com/user-attachments/assets/3961b6e8-20fb-44d5-ace8-6ee98bc3456a" />



⚠️ Notes
- This is not secure encryption — it’s just a Caesar cipher-like implementation for demonstration purposes.
- Works best for text-based files.
- Encrypted files will overwrite the original file, so keep backups if needed.


📜 License
This project is licensed under the MIT License.

