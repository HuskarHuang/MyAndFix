.class public Lcom/hwh/test/hwh_CF;
.super Ljava/lang/Object;
.source "hwh.java"


# instance fields
.field private fix:I

.field private test:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const-string v0, "hwh bug"

    iput-object v0, p0, Lcom/hwh/test/hwh_CF;->test:Ljava/lang/String;

    .line 5
    const/4 v0, 0x0

    iput v0, p0, Lcom/hwh/test/hwh_CF;->fix:I

    return-void
.end method


# virtual methods
.method public getFix()I
    .locals 2
    .annotation runtime Lcom/alipay/euler/andfix/annotation/MethodReplace;
        clazz = "com.hwh.test.hwh"
        method = "getFix"
    .end annotation

    .line 17
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    iget v1, p0, Lcom/hwh/test/hwh_CF;->fix:I

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    .line 18
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/hwh/test/hwh_CF;->setFix(I)V

    .line 19
    iget v0, p0, Lcom/hwh/test/hwh_CF;->fix:I

    return v0
.end method

.method public getTest()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/alipay/euler/andfix/annotation/MethodReplace;
        clazz = "com.hwh.test.hwh"
        method = "getTest"
    .end annotation

    .line 8
    const-string v0, "hwh bug fix"

    invoke-virtual {p0, v0}, Lcom/hwh/test/hwh_CF;->setTest(Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcom/hwh/test/hwh_CF;->test:Ljava/lang/String;

    return-object v0
.end method

.method public setFix(I)V
    .locals 0
    .param p1, "fix"    # I

    .line 23
    iput p1, p0, Lcom/hwh/test/hwh_CF;->fix:I

    .line 24
    return-void
.end method

.method public setTest(Ljava/lang/String;)V
    .locals 0
    .param p1, "test"    # Ljava/lang/String;

    .line 13
    iput-object p1, p0, Lcom/hwh/test/hwh_CF;->test:Ljava/lang/String;

    .line 14
    return-void
.end method
