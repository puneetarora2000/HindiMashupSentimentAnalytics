package mashup;

import java.io.BufferedReader;
 import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ArffLoader;
import weka.classifiers.bayes.NaiveBayesUpdateable;

import java.io.File;
import java.io.FileReader;
import java.util.Random;
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import static weka.core.Instances.test;

/**
 * This example trains NaiveBayes incrementally on data obtained
 * from the ArffLoader.
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 */
public class NaiveTweetClassifier {

   
  public static void main(String[] args) throws Exception {
    // load data
    BufferedReader breader = null;
		breader = new BufferedReader(new FileReader(Common.arfffile));
		Instances train = new Instances(breader);
		train.setClassIndex(train.numAttributes()-1);
		breader.close();
		NaiveBayes nB = new NaiveBayes();
		nB.buildClassifier(train);
		Evaluation eval = new Evaluation(train);
		eval.crossValidateModel(nB, train, 10, new Random(1));
		System.out.println(eval.toSummaryString("\nResults\n=====\n",true));
		System.out.println("F-Score :"+eval.fMeasure(1)+"\nPrecision :"+eval.precision(1)+"\nRecall :"+eval.recall(1));

    
    
  }
  
  
  
  
}