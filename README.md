##Amaç
Bu uygulama basit bir bankacılık sistemine hizmet veren rest api'dir.
Uygulamanin hiçbir unit testi olmayip, %100 unit test coverage'a ihtiyaç vardır. 

    - Tüm fonksiyonalitelerin testini de kapsayacak şekilde code coverage sağlanmalıdır. 
    - Notlandırma coverage üzerinden yapılacak. 
    - Mock kullanılması gereken noktalarda kullanılmadan yapılan testler yokmuş gibi kabul edilecektir ve notlandırılmayacaktır. 

##Uygulamayi baslatmak ve manual testler
Uygulamayi baslatmak icin `com.aric.samples.account.Application` class'indaki main methodunu calistirmaniz gerekiyor.
Run etmek için herhangi bir özel bir run configuration gerekmemektedir.

##Uygulamayi baslattiktan sonra asagidaki httpie(https://httpie.org/docs) komutu ile ornek bir kayit olusturulabilir.

    http POST :8080/account < ./src/main/resources/accounts.json

###sonrasinda

    http GET :8080/query name==Dursun 
###komutu ile account bilgilerine erisilip

    http GET :8080/deposit id==1 amount==13403 
###komutu ile para yatirilip
 
    http GET :8080/withdraw id==1 amount==13403
###komutu ile de para cekilebilir. 
