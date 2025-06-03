# Generate Checksum: Refactor the code to encrypt a text string and generate a checksum verification.

- Download the Module Five Coding Assignment Checksum Verification Code Base, linked in the Supporting Materials section, and upload it to Eclipse as a new project. Refactor the code to add your first name and last name as a unique data string. You will submit your refactored code for your instructor to review. Then generate the checksum by following these steps:
- Create an object of MessageDigest class using the java.security.MessageDigest library.
- Initialize the object with your selection for an appropriate algorithm cipher.
- Use the digest() method of the class to generate a hash value of byte type from the unique data string that includes your first name and last name.
- Convert the hash value to hex using the bytesToHex function.
- Create a RESTFul route using the @RequestMapping method to generate and return the required information, including the hash value, to the secure web browser.