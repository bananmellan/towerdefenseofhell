FLAGS = -g
JC = javac
.SUFFIXES: .java .class

.java.class:
	$(JC) $(FLAGS) $*.java



CLASSES = \
        src/Game.java \
        src/Board.java 


default: classes

classes: $(CLASSES:.java=.class)


clean:
	$(RM) src/*.class
