class CaesarLogic{
  char[] alphabet = {'а','б','в','г','д','е','ё','ж','з',
                    'и','й','к','л','м','н','о','п','р',
                    'с','т','у','ф','х','ц','ч','ш','щ',
                    'ъ','ы','ь','э','ю','я'};
  char[] alphabet_big = {'А','Б','В','Г','Д','Е','Ё','Ж','З',
                        'И','Й','К','Л','М','Н','О','П','Р',
                        'С','Т','У','Ф','Х','Ц','Ч','Ш','Щ',
                        'Ъ','Ы','Ь','Э','Ю','Я'};


    //поиск индекса элемента в алфавитах
    char findIndex(char letter, int shift){
      int k = 0;
      for(int i =0; i < alphabet.length; i++){
        if(alphabet[i]==letter){
          k++;
          if (i+shift >= alphabet.length)
            return alphabet[shift-(alphabet.length-i)];
          else if(i+shift < 0)
            return alphabet[alphabet.length+shift+i];
          else
            return alphabet[i+shift];
        }
    }
        if(k!=0){
          for(int i =0; i < alphabet_big.length; i++){
              if(alphabet_big[i]==letter){
                return alphabet_big[i+shift];
              }
          }
        }
          return letter;
      }





    void logic(String word, int shift){
      String indexWords = "";
      for(int i = 0; i < word.length(); i++){
        indexWords += findIndex(word.charAt(i), shift);
      }
      System.out.println(indexWords);
    }


}
