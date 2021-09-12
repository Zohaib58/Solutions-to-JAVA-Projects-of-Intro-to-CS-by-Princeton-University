/*
	Given a DNA string, find all genes it contains.

	Background: Biologists use a simple model to represent the building blocks of life, in which the letters A, C, G, and T represent the four bases in the DNA of living organisms. 
	A gene is a substring that represents a functional unit of critical importance in understanding life processes.

	A gene has following properties:

	It begins with the start codon ATG.
	Its length is a multiple of 3.
	It ends with one of the stop codons TAG, TAA, or TGA.
	It has no intervening stop codons.
	Example: If String DNA = "ATAGATGCATAGCGCATAGCTAGATGTGCTGAC"
	Then ATGCATAGCGCATAG and ATGTGCTGA are two genes inside DNA.
*/

public class DNA
{
    public static void main(String[] args)
    {
        String dna = args[0];
        String gene = "";

	// Traversing the string DNA
        for (int i = 0, length = dna.length(); i < length; i++)
        {
	    // Checking that the three characters including i of the string are 'ATG'
            if (dna.charAt(i) == 'A' && dna.charAt(i+1) == 'T' && dna.charAt(i+2) == 'G')
            {
                int d = i; // If the three consecutive characters in the string are ATG, then assigning the vaue fo i to 'd'
			
		/*

		 Checking whether the GENE is ending, by using OR operator and checking whether the three consecutive characters are one of those mentioned in the
		 question. If the gene is not ending, then by using the method substring, 3 characters are added to the string 'gene' and d is incremented by 3.

		/* 
                while(!(dna.substring(d, d+3).equals("TAG")  || dna.substring(d, d+3).equals("TAA") || dna.substring(d, d+3).equals("TGA")))
                {
                    gene += dna.substring(d, d+3);
                    d += 3;
                }
                System.out.print(gene + dna.substring(d, d+3) + " "); // Adding the last three characters of the gene to print because they were not added in the loop above
                gene = "";
            }
        }
    }
}
