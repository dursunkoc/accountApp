##Amac
Bu uygulama basit bir bankacilik sistemine hizmet veren rest api'dir.
Uygulamanin hicbir unit testi olmayip, %100 unit test coverage'a ihtiyac vardir.

##Uygulamayi baslatmak ve manual testler
Uygulamayi baslatmak icin `com.aric.samples.account.Application` class'indaki main methodunu calistirmaniz gerekiyor.
    
##Uygulamayi baslattiktan sonra asagidaki httpie komutu ile ornek bir kayit olusturulabilir.

    http POST :8080/account < ./src/main/resources/accounts.json

###sonrasinda

    http GET :8080/query name==Dursun 
###komutu ile account bilgilerine erisilip

    http GET :8080/deposit id==1 amount==13403 
###komutu ile para yatirilip
 
    http GET :8080/withdraw id==1 amount==13403
###komutu ile de para cekilebilir. 
