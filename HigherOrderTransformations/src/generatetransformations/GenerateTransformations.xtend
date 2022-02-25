package generatetransformations

import java.io.File

import java.io.FileWriter
import m2m.M2mPackage
import m2m.MappingModel
import m2m.MappingRule
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
//import org.xtext.hcl.HclPackage
import java.util.Iterator
import org.eclipse.emf.common.util.BasicEList
import m2m.Model
import java.util.Set
import java.util.HashSet
import org.eclipse.emf.ecore.EPackage
import java.io.PrintStream
import org.eclipse.emf.ecore.EStructuralFeature
import java.util.Stack
import java.util.List
import java.util.ArrayList
import java.util.Arrays

class GenerateTransformations {
	
ResourceSet resourceSet 
Resource resource;
MappingModel mappingModel
EObject root  
File diskLocation
URI resourceURI
EClass mainElement

Set <String> reservedKeywords = new HashSet<String>(Arrays.asList("from", "map"));
Set <MappingRule> setOfDisjunctedRules = new HashSet<MappingRule>()
Set <MappingRule> setOfDisjunctRules = new HashSet<MappingRule>()
EList <MappingRule> ruleNoCondition = new BasicEList<MappingRule>()
Stack <EClass> stackClass = new Stack <EClass>()
Stack <EReference> stackReference = new Stack <EReference>()
EList <EReference> referencesOfClassInListContainer = new BasicEList<EReference>()
EList <EClass> isVisited = new BasicEList<EClass>()
EList <EReference> storeReferences = new BasicEList<EReference>()
Set <EClass>  listContainer = new HashSet<EClass>()
EList <String> kthimi = new BasicEList<String>()
Set <String> listaduplikate = new HashSet<String>()
Set <MappingRule> gjitherregullatdisjunct = new HashSet<MappingRule>()
Set <String> disjunctitotal = new HashSet<String>()
EList <String> emritwinit = new BasicEList<String>()
EList <MappingRule> twinRule = new BasicEList<MappingRule>()
EList <MappingRule> disjunctedTwinRules = new BasicEList<MappingRule>()
EList <MappingRule> disjunctedRules = new BasicEList<MappingRule>()
Set <String>  alreadyPrintedDisjunctedRule = new HashSet<String>()
ArrayList <MappingRule> rregullatenjejta = new ArrayList<MappingRule>()
Set <MappingRule> dis = new HashSet<MappingRule>()
Set <MappingRule> isPrinted = new HashSet<MappingRule>()
Set <MappingRule> rregullatperf = new HashSet<MappingRule>()
Set <MappingRule> checkSameRule = new HashSet<MappingRule>()
Set <MappingRule> mainElementsRules = new HashSet<MappingRule>()
Set <MappingRule> disjunctTwinRules = new HashSet<MappingRule>()
Set <MappingRule> disjunctRules = new HashSet<MappingRule>()
Set <MappingRule> disjunctRulesInvokation = new HashSet<MappingRule>()
Set <MappingRule> disjunctedRulesnames = new HashSet<MappingRule>()
Set <Model> inOutModels = new HashSet<Model>()
Set <EClass> inputSuperType = new HashSet<EClass>()
Set <EClass> outputSuperType = new HashSet<EClass>()
//EList <Model> inOutModels = new BasicEList<Model>()
EList <Model> leftModels = new BasicEList<Model>()
EList <Model> rightModels = new BasicEList<Model>()
Set <MappingRule> siblingRules = new HashSet<MappingRule>()
EList <String> saveMappingCondition = new BasicEList<String>()
Set <EPackage> modelType = new HashSet<EPackage>()
Set <MappingRule> inheritedRules = new HashSet<MappingRule>()
Set <String> duplicates = new HashSet<String>()
Set <String> unique = new HashSet<String>()
Iterator <MappingRule>  disjunctIterator
Iterator <MappingRule>  disjunctTwinIterator
Iterator <String>  disjunctTotalIterator
Iterator <Model>  leftModelIterator
Iterator <Model>  rightModelIterator
int i
int j
int k
int d=0
int g
int katjeter = 0

MappingRule nextMR
MappingRule lastMR
String tjetri
String fundit
MappingRule nextTwinMR
MappingRule lastTwinMR
File myObj
PrintStream myWriter
val String checkIfThereisADiscjunt = null

def qualifiedName(EObject input){
	if (input instanceof EClass){
		return (input as EClass).EPackage.name + " :: " + input.name
	}
} 



def doEMFSetup(){
	resourceSet = new ResourceSetImpl();
	resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
	resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new EcoreResourceFactoryImpl());
	resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/eclipse-workspace/org.xtext.example.hclsope/model/generated/HclScope.ecore").absolutePath), true)
	resourceSet.getResource(URI.createFileURI(new File ("/Users/mlj01/eclipse-workspace/Papyrus/org.eclipse.papyrus-rt/plugins/xtumlrt/metamodel/org.eclipse.papyrusrt.xtumlrt.statemach.model/model/statemach.ecore").absolutePath), true)
	//resourceSet.getPackageRegistry().put(HclPackage.eNS_URI, HclPackage.eINSTANCE);
	resourceSet.getPackageRegistry().put(M2mPackage.eNS_URI, M2mPackage.eINSTANCE);	
	resource = resourceSet.getResource( URI.createFileURI(new File("G2T.m2m").getAbsolutePath()), true);		
	//resource = resourceSet.getResource( URI.createFileURI(new File("T2G.m2m").getAbsolutePath()), true);	 
}
def getRoot() {
	doEMFSetup	
	root = resource.contents.get(0);
	mappingModel = root as MappingModel;	
}
/*
 * Generate the modeltype declarations that serve as reference to the metamodels that will be used in the transformation.
 * modelType is a HashSet, because in the case of an in-place transformation, the user is supposed to define the metamodel both as a leftModel and a rightModel.
 * However, there is no need to this metamodel declared twice. In a HashSet you cannot include ane element that is already present.  
 */
def generateModelType(){
	getRoot	
	for (leftModel : mappingModel.leftModels){
		if (!modelType.add(leftModel.model)){
			modelType.add(leftModel.model)
		}
	} 
	for (rightModel : mappingModel.rightModels){
		if (!modelType.add(rightModel.model)){
			modelType.add(rightModel.model)
		}
	} 
	for (package : modelType){
		println("modeltype " + package.name + " uses " + "'" + package.nsURI + "';")
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////
def generateTransformationDeclaration(){
	generateModelType
	println
	print("transformation " + mappingModel.name + "(") 
	
	for (leftmodel : mappingModel.leftModels){	
		for (rightmodel : mappingModel.rightModels){			   
			if (leftmodel.model === rightmodel.model){
				inOutModels.add(leftmodel)
			}
		}			 
	}

	for (leftmodel:mappingModel.leftModels){
		leftModels.add(leftmodel)
	}

	
	for (rightmodel:mappingModel.rightModels){
		rightModels.add(rightmodel)	
	}
	

	for (i = 0; i<inOutModels.size;i++){
		for (j = 0; j<leftModels.size;j++){
			if (inOutModels.get(i).model === leftModels.get(j).model){
				leftModels.remove(j)
			}
		}
		for (k = 0; k<rightModels.size;k++){
			if (inOutModels.get(i).model === rightModels.get(k).model){
				rightModels.remove(k)
			}	
		}	
	}
	
	for ( j = 0; j < leftModels.size; j++){
		val leftmodelname = leftModels.get(j).model.name + "Model"	
		print(" in " + leftmodelname + ":" + leftModels.get(j).model.name)
			if (j !== leftModels.size-1 || !rightModels.empty || !inOutModels.empty){
				print(",")
			}	
	}
	
	for (k = 0; k < rightModels.size; k++){
		val rightmodelname = rightModels.get(k).model.name + "Model"
		print(" out " + rightmodelname + ":" + rightModels.get(k).model.name)
			if (k !== rightModels.size-1  || !inOutModels.empty){
				print(",")
			}	
	}
	
	for (i = 0; i < inOutModels.size; i++){
		val modelname = inOutModels.get(i).model.name + "Model"
		print(" inout " + modelname + ":" + inOutModels.get(i).model.name)
			if (i !== inOutModels.size-1 ){
				print(",")
			}
	}
	println (");")
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * When we invoke a rule, here we check if there are other rules defined with the same input and output.
 * If that is the case then, a rule is generated that disjuncts these rules, with the name of the input and output, and the extension Disjunct
 * If that is the case we should print the disjuncting rule (as invoked rule) with the extension Disjuncts 
 */
def invokeRegularOrDisjunctTwinMain(){
	for (rule : mappingModel.rules){
		if (rule.input == mainElement){
		    mainElementsRules.add(rule)			
		}
	}
	if (mainElementsRules.size() === 1) {
	
		println ((mainElementsRules.get(0).input as EClass).name + "2" + (mainElementsRules.get(0).output as EClass).name + "();")
		println("}")
	}
	else if (mainElementsRules.size() !== 1) {
	
		println ((mainElementsRules.get(0).input as EClass).name + "2" + (mainElementsRules.get(0).output as EClass).name + "Disjunct();")
		println("}")
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////
def generateMainFunction(){
generateTransformationDeclaration
println("main() {")	
	if (leftModels.size === 1) {
		mainElement = (mappingModel.leftModels.get(0).model.eContents.get(0)) as EClass;
		print(mappingModel.leftModels.get(0).model.name + "Model.rootObjects()[" + mappingModel.leftModels.get(0).model.name + "::" + mainElement.name + "] -> map " )
	}
	else {
		mainElement = (mappingModel.mainLeftMetamodel.model.eContents.get(0)) as EClass;
		print(mappingModel.mainLeftMetamodel.model.name + "Model.rootObjects()[" + mappingModel.mainLeftMetamodel.model.name + "::" + mainElement.name + "] -> map " )
	}		
	invokeRegularOrDisjunctTwinMain();
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * The comments might be helpful for the user to also locate the errors
 */
def generateComment(MappingRule rule){
	if (rule.comment !== null) {
		println("//"+rule.comment)
	}	
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*/
 * For each rule we check if any of the rules in the mapping model, could be its disjuncted rule. 
 * The rules that have to fulfilled for the condition to evaluate to true are the following: 
 * 1- The output of the main rule should be a superType of the output of the disjunctedRule or it should be the same
 * 2- The input of the main rule should be a superType of the input of the disjunctedRule or it should be the same
 * 3- The input and output of the disjuncted rule should not be abstract (not quite sure about the input because if the input is abstract it does not mean that the mapping operation will also be abstract)
 * 4- Not both input and output of the main rule can be the same to the input and output of the discjunted rule (this would be the case for twin rules)
 */
def populateListWithDisjunctRules (MappingRule rule, MappingRule disjunctrule){
	if (((rule.output as EClass).isSuperTypeOf((disjunctrule.output) as EClass) || (disjunctrule.output === rule.output))
	&& ((disjunctrule.input === rule.input) || (rule.input as EClass).isSuperTypeOf((disjunctrule.input) as EClass))
	&& !((disjunctrule.output) as EClass).abstract 
	&& (rule.input !== disjunctrule.input || rule. output !==disjunctrule.output)){
		disjunctRules.add(rule)	
		disjunctedRules.add(disjunctrule) 			    			
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * We include the names of the disjuncted rules and in the cases where we have duplicate rules, we print input2outputDisjunct
 */
def populateListWithNamesOfDisjunctedRules(){
	while (disjunctIterator.hasNext()){
	nextMR = disjunctIterator.next				
		if (listaduplikate.contains(nextMR.name) && !alreadyPrintedDisjunctedRule.contains(nextMR.name)){		
			disjunctitotal.add(qualifiedName(nextMR.input) + " :: " + ((nextMR.input) as EClass).name + "2" + ((nextMR.output) as EClass).name + "Disjunct")
			alreadyPrintedDisjunctedRule.add(nextMR.name)
		}
		else if (!listaduplikate.contains(nextMR.name)){  
			disjunctitotal.add(qualifiedName(nextMR.input) + " :: " + ((nextMR.input) as EClass).name + "2" + ((nextMR.output) as EClass).name) 						
	    } 	
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * print the signature of the disjunct rule and the disjuncted rules. The disjuncted rules are printed by iterating the list returned by populateListWithNamesOfDisjunctedRules
 */
def printDisjunct(MappingRule rule){
	//print signature
	println("mapping " + qualifiedName(rule.input) + " :: " + ((rule.input) as EClass).name + "2" + ((rule.output) as EClass).name + "Disjunct" + "() : " + qualifiedName(rule.output)) 
	print("disjuncts ")
	
	listaduplikate = findDuplicatesInDisjunctedRules(disjunctedRules)
	disjunctIterator = disjunctedRules.iterator(); 
	lastMR = disjunctedRules.get(disjunctedRules.size-1) 
	populateListWithNamesOfDisjunctedRules()
	
    //print the disjuncted rules
	disjunctTotalIterator = disjunctitotal.iterator();
	fundit = disjunctitotal.get(disjunctitotal.size-1)
	while (disjunctTotalIterator.hasNext){
		tjetri = disjunctTotalIterator.next
		print (tjetri)
		if (tjetri != fundit)
		{
			print (", ")
		}
	}
	println("{}")  
	println  
	listaduplikate.clear
	disjunctitotal.clear
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * There might be cases (not present in our use case), where we might have a tree of disjunctions. 
 * A mapping rule can have a disjuncted rule MappingRuleDisjuncted which might disjunct two other rules.
 * We need to make sure that we print MappingRuleDisjuncted as part of the disjuncted rules and not the two rules. 
 * In the following we find these possible duplicates.
 */
def findDuplicatesInDisjunctedRules(EList<MappingRule> listwithdublicates){
	for (iterojme : listwithdublicates){
		if (unique.contains(iterojme.name)){
			duplicates.add(iterojme.name)
		}
	    else {
	    	unique.add(iterojme.name)
	    }	
	}	
	return duplicates
} 
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Same as for populateListWithDisjunctedRules, but now the last condition changes.
 * Why don't we have them together with an if else if? 
 */
def populateListWithTwinRules (MappingRule rule, MappingRule disjunctedrule){
	if (((rule.output as EClass).isSuperTypeOf((disjunctedrule.output) as EClass) || (disjunctedrule.output === rule.output))
	&& !((disjunctedrule.output) as EClass).abstract && !((disjunctedrule.input) as EClass).abstract
	&& ((disjunctedrule.input === rule.input) || (rule.input as EClass).isSuperTypeOf((disjunctedrule.input) as EClass))){
	if (rule.input === disjunctedrule.input || rule.output === disjunctedrule.output){
		twinRule.add(disjunctedrule)
	}	
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Print the signature and the disjuncted mapping rules in the case of twin mapping rules. The twin mapping rules will be the disjuncted rules,
 * and the disjunct rule will be created input2outputDisjunct. We include the rule in a list and check that it is not part of the list before
 * proceeding any further. 
 */ 

def printDisjunctTwin (MappingRule rule){
	rule.name = ((rule.input) as EClass).name + "2" + ((rule.output) as EClass).name + "Disjunct"
	if (!emritwinit.contains(rule.name)){
	println("mapping " + qualifiedName(rule.input) + " :: " + rule.name + "() : " + qualifiedName(rule.output)) 
	print("disjuncts ")
	disjunctTwinIterator = twinRule.iterator(); 
	lastTwinMR = twinRule.get(twinRule.size-1)  
			
	while (disjunctTwinIterator.hasNext()){
		nextTwinMR = disjunctTwinIterator.next
		print(qualifiedName(nextTwinMR.input) + " :: " + ((nextTwinMR.input) as EClass).name + "2" + ((nextTwinMR.output) as EClass).name + katjeter) 
			if (nextTwinMR != lastTwinMR){
				print (", ")
			}   
			katjeter++    						
	} 
	println("{}") 
	println
	emritwinit.add(((rule.input) as EClass).name + "2" + ((rule.output) as EClass).name + "Disjunct")	
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * A rule will be abstract if the target of the output of the mapping rule is abstract
 * Otherwise the rule will be non-abstract
 */
def printRegularOrAbstractMapping (MappingRule rule){
	if (((rule.output) as EClass).abstract){
		rule.name = "Abstract" + ((rule.input) as EClass).name + "2" + ((rule.output) as EClass).name
		println("abstract mapping " + qualifiedName(rule.input) + " :: " + rule.name + "() : " + qualifiedName(rule.output))     	 	
	}
	else {
		rule.name = ((rule.input) as EClass).name + "2" + ((rule.output) as EClass).name
		println("mapping " + qualifiedName(rule.input) + " :: " + rule.name + "() : " + qualifiedName(rule.output)) 
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * For the input and output of the mapping rule, we store their superTypes in two corresponding lists.
 * Then, we iterate through all the mapping rules available in the mapping model and we inherit the rules that fulfill the following conditions.
 * 1- The input of the mapping rule we are iterating, must be a superType of the input of the mappingrule we are working with or the same
 * 1- The output of the mapping rule we are iterating, must be a superType of the output of the mappingrule we are working with or the same
 * 3- The input and output of the mapping rule we are iterating, should not both be the same to the input and output of the mappingrule we are working with.
 */
 def selectInheritedRules(MappingRule rule){
 	for (superType : ((rule.input) as EClass).ESuperTypes){
		inputSuperType.add(superType)
	}
	//println ("Input SuperType: " + inputSuperType)
	for (superType : ((rule.output) as EClass).ESuperTypes){
		outputSuperType.add(superType)
	}
	//	println ("Output SuperType: " + outputSuperType)
	for (inheritedRule : mappingModel.rules){
		if ((inputSuperType.contains(inheritedRule.input) || rule.input == inheritedRule.input) && (outputSuperType.contains(inheritedRule.output) || rule.output == inheritedRule.output)){
			if (!(inheritedRule.input == rule.input && inheritedRule.output == rule.output)){
				inheritedRules.add(inheritedRule)
			}
		}
	}
 }
 //////////////////////////////////////////////////////////////////////////////////////////////
/*
 * We print the inheritedRules.
 * The inherited rules can be abstract or non-abstract, thus we have conditions for both cases.
 * We print a , to separate between the inherited rules. 
 */
def generateInheritance(MappingRule rule){	
	selectInheritedRules(rule)	
	if (!inheritedRules.empty){
	print ("inherits ") 
		for (iterator : inheritedRules){
			if (((iterator.output) as EClass).abstract){
			print( qualifiedName(iterator.input) + " :: " + "Abstract" + ((iterator.input) as EClass).name + "2" + ((iterator.output) as EClass).name)
			}
			else {
			print( qualifiedName(iterator.input) + " :: " + ((iterator.input) as EClass).name + "2" + ((iterator.output) as EClass).name)
			}
			if (iterator !== inheritedRules.get(inheritedRules.size-1)){
				print(", ")
			}
		}
	  println
	}
	inputSuperType.clear
	outputSuperType.clear
} 
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Generate conditions for mapping rules that map EClasses
 */
def generateFilterEClass(MappingRule rule){
	if (rule.filter !== null){
		println("when {" + rule.filter + "}")
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * 
 */
def transformAttributes(MappingRule childRule){
    print("    result." + ((childRule.output) as EAttribute).name)  	
	generateAssignment(childRule) 	
	println("self." + ((childRule.output) as EAttribute).name + ";")	
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * 
 */
def transformAttributesOfAddedClasses(MappingRule childRule){
    print("        "+((childRule.output) as EAttribute).name)  	
	generateAssignment(childRule) 	
	print("self." + ((childRule.output) as EAttribute).name)
	if (childRule.filter !== null){
			println("." + childRule.filter + ";")
		}	
	else {
		println(";")
	}	
}


//////////////////////////////////////////////////////////////////////////////////////////////
/*
 *  * The problem here that I cannot use findPath is that the parent rule input and output are not classes but references.
 * I can check this later
 */
def transformReferencesOfAddedClasses(MappingRule childRule){
	print("        "+((childRule.output) as EReference).name)  	
	generateAssignment(childRule)	
	print("self." + ((childRule.input) as EReference).name)	
	
	if (childRule.filter !== null){
			print(" -> " + childRule.filter)
	}
	for (invokedRule : mappingModel.rules){
		invokedRule.name = ((invokedRule.input) as EClass).name + "2" + ((invokedRule.output) as EClass).name
		storeDisjunctInvokedRules(invokedRule)
		storeInvokedRegularOrDisjunctTwinRules(invokedRule)
		printInvokedRule(invokedRule, childRule)
		disjunctedTwinRules.clear
	}
    disjunctRulesInvokation.clear
    disjunctedTwinRules.clear
    //isPrinted.clear
}

//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Kontrollojme nese ekzistojne duplikate tek storeDisjunct
 */
def storeInvokedRegularOrDisjunctTwinRules(MappingRule invokedRule){
	for (rule : mappingModel.rules){
		if (rule.input == invokedRule.input && rule.output == invokedRule.output){
		    disjunctedTwinRules.add(rule)		
		}
	}
	
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Used to transform references.
 * Makes use of other methods to do that. 
 */
def transformReferences(MappingRule childRule, MappingRule parenti){  	
    print ("     result.")
	findPath(parenti.output, ((childRule.output) as EReference))
	generateAssignment(childRule)
	print ("self.")
	findPath(parenti.input, ((childRule.input) as EReference))
		
	if (childRule.filter !== null){
			print(" -> " + childRule.filter)
	}
	
	for (invokedRule : mappingModel.rules){
		invokedRule.name = ((invokedRule.input) as EClass).name + "2" + ((invokedRule.output) as EClass).name
		storeDisjunctInvokedRules(invokedRule)	
		storeInvokedRegularOrDisjunctTwinRules(invokedRule)	
		printInvokedRule(invokedRule, childRule)
		  disjunctedTwinRules.clear
	}
  disjunctRulesInvokation.clear
  disjunctedTwinRules.clear
  isPrinted.clear
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * 
 */
def generateChildRules(MappingRule rule) {
	if (rule.childRules !== null){   	
		for (childRule : rule.childRules){	
			if (childRule.action.toString == "transform"){	          	
				if (childRule.input instanceof EAttribute && childRule.output instanceof EAttribute){
					transformAttributes(childRule)          		 
				}
				if (childRule.input instanceof EReference && childRule.output instanceof EReference){
					transformReferences(childRule, rule)        		 
				}	
			}		
			else if(childRule.action.toString == "add"){
				addClass(childRule)
			}        		
		}
   }
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Helps find the path from the input or output of the main mapping rule to the reference you are mapping 
 * Logic similar to DFS (Depth First Search)
 * Used stacks because they are based on the LIFO principle
 */
def void findPath  (EObject input, EReference outputReference){ 
   if (outputReference.eContainer == input){
   	if (reservedKeywords.contains(outputReference.name)){
   		print("_" + outputReference.name)
   	}
   	else {
   		print(outputReference.name)
   	}  
   	stackReference.removeAllElements
	   	    	    isVisited.clear 	
   }
   else { 
   	for (iterator: (input as EClass).EReferences){ 
   	    if (!isVisited.contains(iterator.EReferenceType) && iterator.EReferenceType != input){ 
   	    	if (!iterator.EReferenceType.abstract){
   	    	stackReference.add(iterator)    	    	
   	    	}
   	    	isVisited.add(iterator.EReferenceType as EClass)
   	    	if (!(iterator.EReferenceType as EClass).EReferences.empty){   	    		
	   	    	if (!(iterator.EReferenceType as EClass).EReferences.contains(outputReference)){   	    	
	   	    		findPath(iterator.EReferenceType, outputReference)
	   	    	}
	   	    	else {
	   	    		//println(" Ketu fillon Stack reference" + stackReference)
	   	    		for (iterostack : stackReference){   	    			
	   	    				if (reservedKeywords.contains(iterostack.name)){
						   		print("_" + iterostack.name + ".")
						   	}
						   	else {
						   		print(iterostack.name + ".")
						   	}
	   	    		}
	   	    		print(outputReference.name)	   	    	
	   	    		stackReference.removeAllElements
	   	    	    isVisited.clear
	   	    	}	    	
   	    	} 
   	    	else {
   	    		if (stackReference.size !== 0 ){
   	    		stackReference.pop
   	    		//println("Ca u hoq" + stackReference.pop)
   	    		if (stackReference.size !== 0){
   	    			//println("Prandaj perseritet")
   	    			findPath(stackReference.get(stackReference.size-1).EReferenceType, outputReference)   	    	   	    		
   	    		}
   	    	}
   	     }	    	
   	   }     	    		
     }   
     if (stackReference.size !== 0 ){
     	//println("Po ketu ca u hoq" + stackReference.pop)
	     stackReference.pop
	     if (stackReference.size !== 0){
	     	findPath(stackReference.get(stackReference.size-1).EReferenceType, outputReference)
	     }   
     }
     
   }  
}
//////////////////////////////////////////////////////////////////////////////////////////////

/*
 * Check if the rule that is to be invoked disjuncts other rules or not 
 * If it does, store it in an array, so that later in printInvokedRule we know how to print it
 */
def storeDisjunctInvokedRules(MappingRule invokedRule){
	for (disjunctrule: mappingModel.rules){
		if (((invokedRule.output as EClass).isSuperTypeOf((disjunctrule.output) as EClass) || (disjunctrule.output === invokedRule.output))
		&& !((disjunctrule.output) as EClass).abstract 
		&& ((disjunctrule.input === invokedRule.input) || (invokedRule.input as EClass).isSuperTypeOf((disjunctrule.input) as EClass))){
				if (invokedRule.input !== disjunctrule.input || invokedRule. output !==disjunctrule.output)	{
					dis.add(disjunctrule)
					disjunctRulesInvokation.add(invokedRule)		
				}
		}
	}	
}

def gjejRregullinQeKaDisjunct(){
	for (ruleWithDisjunct : mappingModel.rules){
		for (ruleThatWillBeDisjuncted : mappingModel.rules){
			if (((ruleWithDisjunct.output as EClass).isSuperTypeOf((ruleThatWillBeDisjuncted.output) as EClass) || (ruleThatWillBeDisjuncted.output === ruleWithDisjunct.output))
			&& !((ruleThatWillBeDisjuncted.output) as EClass).abstract 
			&& ((ruleThatWillBeDisjuncted.input === ruleWithDisjunct.input) || (ruleWithDisjunct.input as EClass).isSuperTypeOf((ruleThatWillBeDisjuncted.input) as EClass))){
				setOfDisjunctedRules.add(ruleThatWillBeDisjuncted)
			}
		}
		if (setOfDisjunctedRules.size() > 1){
			setOfDisjunctRules.add(ruleWithDisjunct)
		}
		setOfDisjunctedRules.clear
	}
  return setOfDisjunctRules
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*/
 * Prints the invoked rule and the . or -> before the invoked rule based on the upper bound of the source of the childRule.
 * Even though when the source element has an upper bound of -1 we use an ->, if there is a filter, we use a .
 * The invoked rules can have the extension Disjunct or not based on certain conditions
 */
def printInvokedRule (MappingRule invokedRule, MappingRule childRule){
		if ((invokedRule.input as EClass).name == (childRule.input as EReference).EType.name && (invokedRule.output as EClass).name == (childRule.output as EReference).EType.name){
			
			if (disjunctRulesInvokation.contains(invokedRule) && gjejRregullinQeKaDisjunct.contains(invokedRule)){
				//println ("Disjunct Rules: " + disjunctRulesInvokation)
				//println ("Printohet nga e para")
				if (((childRule.input) as EReference).upperBound === -1){
						println(" -> map " + invokedRule.name + "Disjunct();")
				}
				else if (((childRule.input) as EReference).upperBound === 1){
						println(".map " + invokedRule.name + "Disjunct();")
				}
			}	
			
			else if (disjunctedTwinRules.size() !== 1 && gjejRregullinQeKaDisjunct.contains(invokedRule)){
			if (!isPrinted.contains(disjunctedTwinRules.get(0))){			
				if (((childRule.input) as EReference).upperBound === -1){
					
						println(" -> map " + (disjunctedTwinRules.get(0).input as EClass).name + "2" + (disjunctedTwinRules.get(0).output as EClass).name + "Disjunct();")
				}
				else if (((childRule.input) as EReference).upperBound === 1){
						println(".map " + (disjunctedTwinRules.get(0).input as EClass).name + "2" + (disjunctedTwinRules.get(0).output as EClass).name + "Disjunct();")
				}
				isPrinted.add(disjunctedTwinRules.get(0))				
				}
			}
			else if (!(invokedRule.output as EClass).abstract){
				if (((childRule.input) as EReference).upperBound === -1){
					if (!childRule.filter.nullOrEmpty){
						println(".map " + invokedRule.name + "();")					
					}
					else {
						println(" -> map " + invokedRule.name + "();")	
					}
				}
				else if (((childRule.input) as EReference).upperBound === 1){
						println(".map " + invokedRule.name + "();")
				}
			}
			else {
				for (subrule : mappingModel.rules){
					if ((invokedRule.output as EClass).isSuperTypeOf(subrule.output as EClass) && (invokedRule.input as EClass) == (subrule.input as EClass) && !(subrule.output as EClass).abstract){
					//println((subrule.input as EClass).name + "2" + (subrule.output as EClass)) 
						if (((childRule.input) as EReference).upperBound === -1){
							if (!childRule.filter.nullOrEmpty){
								println(".map " + (subrule.input as EClass).name + "2" + (subrule.output as EClass).name + "();")					
							}
							else {
								println(" -> map " + (subrule.input as EClass).name + "2" + (subrule.output as EClass).name + "();")	
							}
						}
						else if (((childRule.input) as EReference).upperBound === 1){
								println(".map " + (subrule.input as EClass).name + "2" + (subrule.output as EClass).name + "();")
						}
					}
				}
			}
			
			//isPrinted.clear				
		} 
}

//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * We cannot generate automatically the assignment operator or the addition operator, therefore we let the user decide. 
 * The reason why we cannot generate it is because even though we know that if the source element is not a collection we should use := 
 * (because adding is not possible), in the case where the source is a collection of elements both := (initialize the collection and dropping all previous elements),
 * and += (add to the collection) can be used and we cannot predict that. To make it easier for the user we define := as default (it is used in the majority of cases,
 * therefore the user doesn't have to change it often). 
 */
def generateAssignment (MappingRule childRule){
	if (childRule.assignment.toString == "assignment") {
		print(" := ")
	} 
	else if (childRule.assignment.toString == "addition")
	{
		print(" += ")
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Populate the added class with attributes and references. The mappings should happen between references only or attributes only. 
 * Otherwise, there will be thrown an exception stating that the input and output should be of the same type (either both EAttribute or both EReferences)
 * 
 */
def populateAddedClass(MappingRule childRule){
print("{")
println
	for (grandchRules : childRule.childRules){		
		if (grandchRules.input instanceof EAttribute && grandchRules.output instanceof EAttribute){						
			transformAttributesOfAddedClasses(grandchRules)
		}	
		else if (grandchRules.input instanceof EReference && grandchRules.output instanceof EReference){			
			transformReferencesOfAddedClasses(grandchRules)
	    }		
	    else if ((grandchRules.input.class !== grandchRules.output.class) && ((grandchRules.input instanceof EAttribute && grandchRules.output instanceof EAttribute) || 
	    	(grandchRules.input instanceof EReference && grandchRules.output instanceof EReference))){
	    	throw new IllegalArgumentException("The source and target elements should be of the same type");
	    }		
	    else {
	    	throw new IllegalArgumentException("The type of elements you are trying to map are not supported");
	    }
    }
	println("    };")
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*/
 * The target metaamodel might contain classes that have no corresponding class in the source metamodel (thus cannot be transformed). In this situation,
 * the user should create such class. The class might be left empty, or the user might want to populate it. 
 */
def addClass(MappingRule childRule){
//create the class that is not present in the source metamodel 
	print("    var " + (childRule.output as EReference).EType.name + "Object")
    generateAssignment(childRule)
	print("object " + qualifiedName((childRule.output as EReference).EType))
	if (childRule.childRules.empty){  //leave the class empty (no childRules)
		println("{};")
	}
	else {   //populate the class (childRules)
    populateAddedClass(childRule)			 
	}	
   // add the class as a child of the target class of the main mappingRule
	print("    "+(childRule.output as EReference).name)
	generateAssignment(childRule)
	println((childRule.output as EReference).EType.name + "Object;")			
}
     
//////////////////////////////////////////////////////////////////////////////////////////////
def generateMappingDeclaration(){
generateMainFunction
//gjitherregullatdisjunct = gjejRregullinQeKaDisjunct()
//for (rregull: gjitherregullatdisjunct){
//	println((rregull.input as EClass).name + "2" + (rregull.output as EClass).name)
//}

	for (rule : mappingModel.rules){
		//per te pare a ka rregull tjeter si i joni me te njejtin input dhe output
		for (secondrule : mappingModel.rules){
			if (rule.input === secondrule.input && rule.output === secondrule.output){
				d++
				rregullatenjejta.add(rule)
				rregullatenjejta.add(secondrule)
			}
		}
		generateComment(rule)	
		if (rule.input instanceof EClass && rule.output instanceof EClass){
			rule.name = ((rule.input) as EClass).name + "2" + ((rule.output) as EClass).name
			for (disjunctrule : mappingModel.rules){
				populateListWithDisjunctRules(rule,disjunctrule)
				populateListWithTwinRules(rule,disjunctrule)
			}
			//kjo eshte sepse rregulli mund te beje dhe disjunction
			if (disjunctedRules.size > 1 ){
				println       			
				//println("Keto jane disjunctedRules" + disjunctedRules + " te rregullit " + rule.name)		
				printDisjunct(rule)       				     					
			}			  
			//kjo eshte pa else sepse do ndodhe gjithmone ne rast se nje rregull esht mapur me nje tjeter 
			else if (twinRule.size > 1) {
				println       					
				printDisjunctTwin(rule)  
			}     	
			katjeter=0
		    disjunctedRules.clear
		    twinRule.clear
		    duplicates.clear
		    unique.clear
		    alreadyPrintedDisjunctedRule.clear
		    listaduplikate.clear
		    
		    //this is to understand how to print the name of the mapping rule
		    //if there are other mapping rules with the same input and output , besides the name we also need to add a number (because names should always be unique). 
		    
		    
		    if (d==1){
			printRegularOrAbstractMapping (rule)
            }
            else if (d>1){
            	
            //	println("Duhet te printohej me numer kjo")
            	
            	printRegularOrAbstractMappingTwinSignature (rule,rregullatenjejta)
            }
			if (((rule.input) as EClass).ESuperTypes !== null || ((rule.output) as EClass).ESuperTypes !== null){
				
				//println("Rregullat qe jane inherit:" + inheritedRules)
				generateInheritance(rule)
			}
			inheritedRules.clear
			generateFilterEClass(rule)
			println("{")
			generateChildRules(rule)
			println("}")
		}
			d=0	
			rregullatenjejta.clear	
			//disjunctRulesInvokation.clear
		
	}	

}
/* 
 * When the user defines multiple mapping rules with the same input and output, the user is supposed to define them in the same order he would
 * want them to show in the disjunction (disjunction checks in a chronological order and invokes the first mapping operation whose guard evaluate to true).
 * Nevertheless, the user might make a mistake and we would like to check that. The user should not define a mapping rule (part of these multiple mapping rules),
 * that has no condition, before the mapping rules that have a condition. Otherwise, this would be the mapping rule that would always be invoked. 
 * Therefore, we iterate through the similar rules (i.e., mapping rules that have same input and output), and store the ones that have no condition in 
 * ruleNoCondition, and remove them from the array that contains all the similar rules. The rules in the array will be shifted to the left.
 * Afterwards we add all the mapping rules in the ruleNoCOndition to the array (they will be placed in the end). 
 */
 
def verifyChronologicalOrderOfSimilarRules(MappingRule rule, ArrayList<MappingRule> rregullat){

	for (var i=0 ; i<rregullat.size; i++){
		if (rregullat.get(i).filter.nullOrEmpty){
			ruleNoCondition.add(rregullat.get(i))
			rregullat.remove(rregullat.get(i))
		}
	}
   return rregullat.addAll(ruleNoCondition)
}


//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * When there are multiple similar rules, and we will include them as disjuncted rules, when we print them, them cannot have the same name
 * as in QVTo names have to be unique. Therefore, in such cases, we add the index at the end of the mapping operation name (e.g., StateMachine2StateMachine0)
 * We do the same both for abstract and non abstract mapping rules. 
 */
 
def printRegularOrAbstractMappingTwinSignature (MappingRule rule, ArrayList<MappingRule> rregullat){
 	
    verifyChronologicalOrderOfSimilarRules(rule,rregullat)
	
	if (((rule.output) as EClass).abstract){
		rule.name = "Abstract" + ((rule.input) as EClass).name + "2" + ((rule.output) as EClass).name + rregullat.indexOf(rule)
		println("abstract mapping " + qualifiedName(rule.input) + " :: " + rule.name + "() : " + qualifiedName(rule.output))     	 		
	}
	else {
		rule.name = ((rule.input) as EClass).name + "2" + ((rule.output) as EClass).name + rregullat.indexOf(rule)
		println("mapping " + qualifiedName(rule.input) + " :: " + rule.name + "() : " + qualifiedName(rule.output)) 
	}	
}
//////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Generate the G2T.qvto file
 */	
def writeToFileG2T(){
	myObj = new File("/Users/mlj01/runtime-Transf_Generator_HOTs/GeneratedTransformations/transforms/GeneratedG2T.qvto");
	myWriter = new PrintStream("/Users/mlj01/runtime-Transf_Generator_HOTs/GeneratedTransformations/transforms/GeneratedG2T.qvto");
	System.setOut(myWriter)
	
}
//////////////////////////////////////////////////////////////////////////////////////////////
/* 
 * Generate the T2G.qvto file
 */		
def writeToFileT2G(){
	myObj = new File("/Users/mlj01/runtime-Transf_Generator_HOTs/GeneratedTransformations/transforms/GeneratedT2G.qvto");
	myWriter = new PrintStream("/Users/mlj01/runtime-Transf_Generator_HOTs/GeneratedTransformations/transforms/GeneratedT2G.qvto");
	System.setOut(myWriter)
	
}	
	def static void main(String[] args) {
		
	new GenerateTransformations().writeToFileG2T();
		new GenerateTransformations().generateMappingDeclaration();	 
	
	}
}