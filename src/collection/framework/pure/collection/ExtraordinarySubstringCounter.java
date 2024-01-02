package collection.framework.pure.collection;

import java.util.HashMap;
import java.util.Map;

public class ExtraordinarySubstringCounter {

	public static int countExtraordinarySubstrings(String inputStr) {
		
		System.out.println("size" + inputStr.length());
		
		if (inputStr == null) {
            // Handle the case when inputStr is null
            return 0;
        }
		
		if (inputStr.length() > 2000) {
            // Handle the case when inputStr is null
            return 0;
        }
		
		Map<Character, Integer> mapping = new HashMap<>();
		mapping.put('a', 1);
		mapping.put('b', 1);
		
		mapping.put('c', 2);
		mapping.put('d', 2);
		mapping.put('e', 2);
		
		mapping.put('f', 3);
		mapping.put('g', 3);
		mapping.put('h', 3);
		
		mapping.put('i', 4);
		mapping.put('j', 4);
		mapping.put('k', 4);
		
		mapping.put('l', 5);
		mapping.put('m', 5);
		mapping.put('n', 5);
		
		mapping.put('o', 6);
		mapping.put('p', 6);
		mapping.put('q', 6);
		
		mapping.put('r', 7);
		mapping.put('s', 7);
		mapping.put('t', 7);
		
		mapping.put('u', 8);
		mapping.put('v', 8);
		mapping.put('w', 8);
		
	
		mapping.put('x', 9);
		mapping.put('y', 9);
		mapping.put('z', 9);

		int count = 0;
		
		

		for (int i = 0; i < inputStr.length(); i++) {
			
			char currentChar = inputStr.charAt(i);

            // Skip non-alphabetic lowercase characters
            if (!Character.isAlphabetic(currentChar) || !Character.isLowerCase(currentChar)) {
                continue;
            }
            
			int sum = 0;

			for (int j = i; j < inputStr.length(); j++) {
				char letter = inputStr.charAt(j);
				sum += mapping.get(letter);

				int length = j - i + 1;

				if (sum % length == 0) {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String inputStr = "fmlyamlxwgcipiffxtecgfobmttpgjzcuehukkuwzmuqzmtrumqvdlbzekcgzecderhtmfjpobljyxkffcckgckodrdhxqvypqeahqcdtubkacbuoblyllgvzepiifkxtypzebhzwyzvuiwupdjyiwstlaraqcjrzzcwwgxipsttyodxulreyykuajxnpehahaixxvyfvhgqwpeionlzjcemxxqcqtmpfrneuxdubdftucxgyivrwenxngpjbexgyfdcbkxsnjqowevapbecuodvkgvduxigvpncrjhiioarvxlvmwromcdmamfjtrtjhaozevdmjbbxgnlnhwkhffixxlfxyytxuhxjjtwxatyutrxjdyrjzdwvrsuoefqjsqdbpuvbnwxozjorwuvhcsuehpdhlsgwnnuhlucykcidxyppadqwmmgkokhfxwxqykhuccxrkwaspzpzfjdpkhrrrgrplokcxtvjrhydepckwvqgncszxthzcvycgjtjuznvwtslhdszkhqymbqgmxytwxusjxbajuydiczapewtbdhguqfszujsizrnhkjknrfwcljuzsndmaapkdkkissmmmberkebnwbswonmtyjpiyjwmkmkhvujcdscgjolotrijpukuoewoamyzcgwqcehkjpplxqlriukihpldawfpjmjhlapcdghfkpygijivoojucjgqleanqrmhcbjjdncnhpapythbysjkbploklgrmadybbygmshithhfxswfugoducnmzbwiigexabsjqseghgkklkcnymxqscyllonpnzqammpjwvvbunlkptodsvyzgykuyrotwvafmgtrosqcesbyuvxmaourzsgmebwlaiasfjyvqbpsrzlgftnpvobddqjhmebhydgxluxxzuriqmjifoaaplodcvweibvpoctgpjntctplkupainncaznkyqfptohguksuxjqasytylqquqwrlrjgrapnaditzlwmgelssgifemffxhsaygglkihczokgtygwsgpyybmdcncsiuqiharykezfsirxpgdmsdakejckzcyzilqskdfcgxtahvnsxvqfnkndqkntlnsqeurrhizsetznagtweicvoagjjdcqnxnkyqvzycavztuvzlzailycgnavvxwijxtfzoopkdcaqxdgwtzrnqzaqbuxzittvaldlxbkohipcrxqvqqtlfdorpcwjbndgijqpjopqteuwdwsaguzefuldiogvtxbepbrrpeohahvlzbsvjesvayhqtosyggtiuelelgdbdomiaoaizoznhapehtkctehgyyyhksacqvfizwmuwdonetcgtavgjjxyumhpdjoinqucychwgztvsswtdjqtqatluwyvllersuobdsqcdltxlqvorstuglsbghiuzgqwrxhoeexaeymyvllyqyajtbxlibeuvkainbjrmwnmhhzwqmbggaqtwghfrfsrjvttwrljrqxyqgwjpbfnsjkphryqniiafrprienxebaavblneqdadzrstdhhmzfgrlxjdmazgcrcwllvhvalrlketpgnzzifiempzownaqxbhknvanjvypowscajcbybijryrjwpcrjnhcscpiijutaldljenoludzgowlwnmelcgwyqiiabgtsffrejuvvquugiataddjbipjiidfnasfkopdgqfrmprglvcmgdrhikljseteqkzhwzqbvwztcscsjawtjawpjvljwusqckkpqveirekksyuoxennpmawhtonklewyaqmkextgvepexwvhglyybvfeooxffpjmfkpzlqjjjuqowqvxtrhqewgxigaldpekwhgudmvzlfndaceoevmglaaqgakwbuslaykejrbsymtkzzcoxuikjgpccgfxkbqgkpctwxyfgijsfithbhthceqvmzqpzaaispnuveamenoqbxdgmmgyhqqoamlmrhbc";
		int result = countExtraordinarySubstrings(inputStr);
		System.out.println("Count of extraordinary substrings: " + result);
	}
}
