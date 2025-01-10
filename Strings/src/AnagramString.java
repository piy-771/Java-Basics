import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
//        //String s1 = "crduacgpvofkrbwbrnukhhhmommoctgmjqpympxcrynnjlodpzvfwmvzfqcfqtjjzixrqsghgttlsfgzpbkvg" +
//                "exbdkjxeeensidjogkncxtyhwgkovwlahmfvcspkxwuqdqrrwgvluixusswojxacawjvgakzdrdjhfaavikoruwul" +
//                "btnanzgcljhyvuyuyvgeosbmbqrafgcwxrwpznacapzyiambmdlzczijxnagskrxljhdrhvylauibwirblwobcsyln" +
//                "fogakgpkccznimtdemtiinmmumklskxckecedmrtuqniqagqtxlpjozwmvtpnpkncghmwmjpkhwtkgtxirkxpxtsrhsidf" +
//                "krxmsxljrhsmflzrxdxdeamhewclenwzbfzgvraiyxiykkceozjkfzfrfmnatnwjaxiyxywazfepoeoghmglnryrikgcezlgeje" +
//                "udilxhyswxdcjxqlbchmlofrflxkxqspoywlpvcgnfgfcrabkzmmavbbqnbzrslgsavopdsxiphaqzbfxjwgjnzxjoiglgnvrimrw" +
//                "evmbudvoucxyrpkfgtlathdanmpfdpwtouuydktmhaftykqtfeoavtycbkgikxlkbgulfhltexfopbbcxilqjuohxjmnhvureorrmo" +
//                "jptbxruxffddkyrfqnkunaojukjbcwfanzonqresghssttjbafswebtomnlaeaprwjlzzjmcjuxejyvzskiizrxglh" +
//                "dgzazlcoqkhlymkfrpdsjuwiozwznwmzkqnbamqxjtgtvjxswqhtowkvqndxnlqobfyeiloaoyqcxicvquugxrpuxs" +
//                "tsezwmyvvgqkaufscsfmmkedqbyumgogczimlexmzvdvsahfooiudlnxhvsayvblbqfcaibjxkskmnuduwwkpdtckw" +
//                "pprkriccajdtlhudhtngltyjwmftywhwpulrioxqbaxnvorbjhustgaxhtshttgnsrylgf";
//        String s2 = "dynpmuascgumppeagbfvhyxojbslbkyzvfaeaivztvktjqnzfdiarttsijsmupcnebpdfaozfcqaekbpukqayj" +
//                "mlcovkulqxxkpczkftzfzzblwncdhcmecizlioikazdqgwxebhxxtplzdzjcvvxuawvkollqmqnazirydslfhrxnofrl" +
//                "jelydclrspihhnfgawhtuseoixauebqfxrabrriwpqnnebpiekgyigztgbielgujbmltxyldlvmgsggngnolbxtzlrnbqxqs" +
//                "vwucidqbqdmfhpvbcpjpyloqvncjcumfdhdlhfhljlkhmhimernwuvtjjeppzzkpnpltfejoruhbslslvodqzixooeytvxdaf" +
//                "xjhlzszkameczfjzxhwvkxiozncczjnjpbnxsdciknmpiqfyeufoctckertlbjsuckggmgttpnlqgfuebytughbgflcsoxivqdn" +
//                "vmkxnrkwqxvboyzqzfxduftmhsmibnkmybzsutumjgcghjuhoidpubdmkqrlyvubnincengdhchomldfxmnhemmpqjtoedbnmsjc" +
//                "tmjnbqytmvdvevgzqktkdgwspawgyholtmqbpnloukblrdjouhkqyplrlyeglumptpmalkeqwjsrsdtszjkabstgyovwmgvxkjvor" +
//                "pqokxmyptzppzluqjcwkfudywfindbtxdanmksezetxrqjfrwpluydrbtqkcuuqyvoxansqhfzhnhkiddswvczjpvbndfckgzfygrxi" +
//                "kgkfkikhjukuobiyvtfncekbppnlagcdcrlqhljkcmgvybauxvnkoqlzjsewfvwvnbhcuqhtbcojfkhovnyxdfhrogblqeivfpissdfy" +
//                "ywxwwcyrqzqdxuyrmeahpkvkossnppcddvsxwwmarqpeturystfgnalxbxxilqfgdvxpjcjllsjwriyvbvtvhwddzhkrluloqxkhgjji" +
//                "lhngnecvvpklyolvvb";

        String s1 = "aabbbcd";
        String s2 = "abbbccd";
        boolean isAnagram = true;
        int[] intArray = new int[26];
        for (int i = 0; i <s1.length() ; i++) {
            //System.out.println((int)s1.charAt(0));
            intArray[(int)s1.charAt(i) - 97]++;
            intArray[(int)s2.charAt(i) - 97]--;

        }
        for (int i  = 0; i < intArray.length;i ++) {
            if(intArray[i] != 0){
                isAnagram = false;
                break;
            }
        }
        System.out.println(isAnagram);
        //System.out.println(Arrays.toString(intArray));





//
//        if(s1.length() == s2.length()){
//            for(int i =0;i<s1.length();i++){
//                String temp = "";
//                temp += s2.charAt(i);
//
//                System.out.println(temp);
//                System.out.println(s1.contains(temp));
//                if(!s1.contains(temp)){
//
//                    isAnagram=  false;
//                }else{
//                    s1.replace(s2.charAt(i),'0');
//                }
//            }
//
//        }else{
//            isAnagram = false;
//        }
//        System.out.println(s1);
//
//        System.out.println(isAnagram);
    }
}
