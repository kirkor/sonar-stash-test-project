# Multi-module project to test Sonar Stash plugin

If project which is analyzed is placed in different location then GIT ROOT, in Stash/Bitbucket the diff path looks like:
```
src/lib/src/main/java/pl/com/bernas/sonar/stash/test/lib/DummyService.java
```
Sonar Stash plugin is not able to add comments, because  of message:

```
INFO: Comment "squid:S00112" cannot be pushed to Stash like it does not belong to diff view - lib/src/main/java/pl/com/bernas/sonar/stash/test/lib/DummyService.java (line: 21)
```

With this change: https://github.com/AmadeusITGroup/sonar-stash/pull/56 you are able to workaround this problem by setting your sonar scanner like this:

```
sonar.projectBaseDir=src/
sonar.analysis.mode=preview
sonar.stash.notification=true
sonar.stash.project=sp
sonar.stash.repository=multimodule
sonar.stash.pullrequest.id=*****
sonar.stash.password=****
sonar.stash.project.base.dir=E:/Jenkins/workspace/CI03

```

I'm executing sonar scanner on Jenkins, my working dir is ```E:/Jenkins/workspace/CI03```. Sonar project are located in ```src/``` dir like in this repo. 
