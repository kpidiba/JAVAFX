# DEPLOY JAVAFX PROJECT

## Launch4j

1. **Install Launch4j**:
   
   - Visit [Launch4j](https://launch4j.sourceforge.net/) and follow the installation instructions.

2. **Configuration**:
   
   - Specify the following details:
     - Output file.
     - JAR file.
     - JRE version (optional).
     - JVM options (such as `--enable-preview --module-path C:/javafx-sdk-20.0.1/lib --add-modules=javafx.controls,javafx.media,javafx.fxml,javafx.graphics`).



## INNO SETUP

1. **Download INNO Setup**:
   
   - Visit [Inno Setup Downloads](https://jrsoftware.org/isdl.php) and download the setup.

2. **Setup**:
   
   - Open Inno Setup and select File > New.
   - Input application details like name, version, publisher, and website.
   - Choose the destination folder and select custom.
   - Set the destination folder to C:.
   - Specify the application folder, typically the javafx lib subfolder like **javafx-sdk-20.0.1**.
   - Select the executable file.
   - Add the **/lib** folder.
   - For the license, download the file from [here](https://jrsoftware.org/files/is/license.txt) or use the provided text below.

## License Agreement

```textile
[Your Enterprise Name] Desktop Application License Agreement

This Faisceaux Desktop Application License Agreement ("Agreement") is entered into by and between [Your Enterprise Name] ("Licensor") and the end user ("Licensee") of the Faisceaux desktop application software developed by Licensor ("Software").

1. License Grant: Subject to the terms and conditions of this Agreement, Licensor hereby grants Licensee a non-exclusive, non-transferable license to use the Software solely for internal business purposes within Licensee's enterprise.

2. Restrictions: Licensee shall not: (a) modify, adapt, alter, translate, or create derivative works of the Software; (b) sublicense, lease, rent, loan, or otherwise distribute the Software to any third party; (c) reverse engineer, decompile, disassemble, or otherwise attempt to derive the source code of the Software; (d) remove, alter, or obscure any proprietary notices or labels on the Software; (e) use the Software for any unlawful purpose or in violation of any applicable laws or regulations.

3. Ownership: Licensor retains all right, title, and interest in and to the Software, including all intellectual property rights therein. This Agreement does not transfer any ownership rights to Licensee.

4. Warranty Disclaimer: THE SOFTWARE IS PROVIDED "AS IS," WITHOUT ANY WARRANTIES OF ANY KIND. LICENSOR DISCLAIMS ALL WARRANTIES, EXPRESS, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, AND NONINFRINGEMENT OF THIRD-PARTY RIGHTS.

5. Limitation of Liability: IN NO EVENT SHALL LICENSOR BE LIABLE FOR ANY INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THE SOFTWARE, EVEN IF LICENSOR HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.

6. Term and Termination: This Agreement shall commence upon Licensee's acceptance and shall continue until terminated. Licensor may terminate this Agreement immediately upon written notice if Licensee breaches any provision herein. Upon termination, Licensee shall cease all use of the Software and destroy all copies thereof.

7. Governing Law: This Agreement shall be governed by and construed in accordance with the laws of [Your Jurisdiction], without regard to its conflicts of law principles.

8. Entire Agreement: This Agreement constitutes the entire understanding and agreement between Licensor and Licensee with respect to the subject matter hereof and supersedes all prior or contemporaneous agreements and understandings, whether oral or written.

By downloading, installing, or using the Software, Licensee agrees to be bound by the terms and conditions of this Agreement. If Licensee does not agree to these terms, Licensee may not use the Software.

For questions or inquiries regarding this Agreement, please contact [Your Contact Information].

[Your Enterprise Name]
[Your Address]
[Your Contact Information]

```

2. INNO SETUP: [Inno Setup Downloads](https://jrsoftware.org/isdl.php) 
- Select File > New
- Put application name , version, Publisher, sit web
- Destination folder  -> select custom
- put C:\
- Application folder put the javafx lib subfolder like **javafx-sdk-20.0.1**
- Select the exe 
- add **/lib** Folder
- Pour la license telececharger ce fichier sur cel lien https://jrsoftware.org/files/is/license.txt  or this 

```textile
[Your Enterprise Name] Desktop Application License Agreement

This Faisceaux Desktop Application License Agreement ("Agreement") is entered into by and between [Your Enterprise Name] ("Licensor") and the end user ("Licensee") of the Faisceaux desktop application software developed by Licensor ("Software").

1. License Grant: Subject to the terms and conditions of this Agreement, Licensor hereby grants Licensee a non-exclusive, non-transferable license to use the Software solely for internal business purposes within Licensee's enterprise.

2. Restrictions: Licensee shall not: (a) modify, adapt, alter, translate, or create derivative works of the Software; (b) sublicense, lease, rent, loan, or otherwise distribute the Software to any third party; (c) reverse engineer, decompile, disassemble, or otherwise attempt to derive the source code of the Software; (d) remove, alter, or obscure any proprietary notices or labels on the Software; (e) use the Software for any unlawful purpose or in violation of any applicable laws or regulations.

3. Ownership: Licensor retains all right, title, and interest in and to the Software, including all intellectual property rights therein. This Agreement does not transfer any ownership rights to Licensee.

4. Warranty Disclaimer: THE SOFTWARE IS PROVIDED "AS IS," WITHOUT ANY WARRANTIES OF ANY KIND. LICENSOR DISCLAIMS ALL WARRANTIES, EXPRESS, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, AND NONINFRINGEMENT OF THIRD-PARTY RIGHTS.

5. Limitation of Liability: IN NO EVENT SHALL LICENSOR BE LIABLE FOR ANY INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THE SOFTWARE, EVEN IF LICENSOR HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.

6. Term and Termination: This Agreement shall commence upon Licensee's acceptance and shall continue until terminated. Licensor may terminate this Agreement immediately upon written notice if Licensee breaches any provision herein. Upon termination, Licensee shall cease all use of the Software and destroy all copies thereof.

7. Governing Law: This Agreement shall be governed by and construed in accordance with the laws of [Your Jurisdiction], without regard to its conflicts of law principles.

8. Entire Agreement: This Agreement constitutes the entire understanding and agreement between Licensor and Licensee with respect to the subject matter hereof and supersedes all prior or contemporaneous agreements and understandings, whether oral or written.

By downloading, installing, or using the Software, Licensee agrees to be bound by the terms and conditions of this Agreement. If Licensee does not agree to these terms, Licensee may not use the Software.

For questions or inquiries regarding this Agreement, please contact [Your Contact Information].

[Your Enterprise Name]
[Your Address]
[Your Contact Information]
```

Feel free to replace placeholders like `[Your Enterprise Name]`, `[Your Address]`, `[Your Contact Information]`, and `[Your Jurisdiction]` with appropriate details.
