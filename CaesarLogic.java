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
    int findIndex(char letter){
      boolean k = false;
      for(int i =0; i < alphabet.length; i++){
        if(alphabet[i]==letter){
          k = true;
          return i;
        }
    }
        if(k==false){
          for(int i =0; i < alphabet_big.length; i++){
              if(alphabet_big[i]==letter){
                return i;
              }
          }
        }
        return 0;
      }





    void logic(String word, int shift){
      int[] indexWords = new int[word.length()];
      for(int i = 0; i < indexWords.length; i++){
        indexWords[i] = findIndex(word.charAt(i));
      }
      for(int item:indexWords){
        System.out.println(item);
      }
    }


}
