def rep1(words):
	d = {'a':".-",
         'b':"-...",
         'c':"-.-.",
         'd':"-..",
         'e':".",
         'f':"..-.",
         'g':"--.",
         'h':"....",
         'i':"..",
         'j':".---",
         'k':"-.-",
         'l':".-..",
         'm':"--",
         'n':"-.",
         'o':"---",
         'p':".--.",
         'q':"--.-",
         'r':".-.",
         's':"...",
         't':"-",
         'u':"..-",
         'v':"...-",
         'w':".--",
         'x':"-..-",
         'y':"-.--",
         'z':"--.."  }

	s = set()
	for word in words:
		rep = ""
		for c in word:
			rep += d[c]
		s.add(rep)
	return len(s)

def rep2(words):
        d = [".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--","-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."]
        return len({''.join(d[ord(i) - ord('a')] for i in w) for w in words})

n=input()
words=list(input().split())
print(rep1(words))
