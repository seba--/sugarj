package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class out  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  public static IStrategoConstructor _consConc_2;

  public static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consVar_1;

  public static IStrategoConstructor _consInt_1;

  public static IStrategoConstructor _consReal_1;

  public static IStrategoConstructor _consStr_1;

  public static IStrategoConstructor _consOp_2;

  public static IStrategoConstructor _consOpQ_2;

  public static IStrategoConstructor _consExplode_2;

  public static IStrategoConstructor _consBuildDefaultPT_1;

  public static IStrategoConstructor _consTuple_1;

  public static IStrategoConstructor _consList_1;

  public static IStrategoConstructor _consListTail_2;

  public static IStrategoConstructor _consAs_2;

  public static IStrategoConstructor _consBuildDefault_1;

  public static IStrategoConstructor _consAnnoList_2;

  public static IStrategoConstructor _consNoAnnoList_1;

  public static IStrategoConstructor _consApp_2;

  public static IStrategoConstructor _consRootApp_1;

  public static IStrategoConstructor _consWld_0;

  public static IStrategoConstructor _consSorts_1;

  public static IStrategoConstructor _consConstructors_1;

  public static IStrategoConstructor _consSortVar_1;

  public static IStrategoConstructor _consSortNoArgs_1;

  public static IStrategoConstructor _consSort_2;

  public static IStrategoConstructor _consSortList_1;

  public static IStrategoConstructor _consSortListTl_2;

  public static IStrategoConstructor _consSortTuple_1;

  public static IStrategoConstructor _consOpDecl_2;

  public static IStrategoConstructor _consOpDeclQ_2;

  public static IStrategoConstructor _consOpDeclInj_1;

  public static IStrategoConstructor _consExtOpDecl_2;

  public static IStrategoConstructor _consExtOpDeclQ_2;

  public static IStrategoConstructor _consExtOpDeclInj_1;

  public static IStrategoConstructor _consConstType_1;

  public static IStrategoConstructor _consFunType_2;

  public static IStrategoConstructor _consSVar_1;

  public static IStrategoConstructor _consLet_2;

  public static IStrategoConstructor _consCallT_3;

  public static IStrategoConstructor _consCallDynamic_3;

  public static IStrategoConstructor _consFail_0;

  public static IStrategoConstructor _consId_0;

  public static IStrategoConstructor _consMatch_1;

  public static IStrategoConstructor _consBuild_1;

  public static IStrategoConstructor _consScope_2;

  public static IStrategoConstructor _consSeq_2;

  public static IStrategoConstructor _consGuardedLChoice_3;

  public static IStrategoConstructor _consPrimT_3;

  public static IStrategoConstructor _consOne_1;

  public static IStrategoConstructor _consAll_1;

  public static IStrategoConstructor _consImportTerm_1;

  public static IStrategoConstructor _consCall_2;

  public static IStrategoConstructor _consScopeDefault_1;

  public static IStrategoConstructor _consBA_2;

  public static IStrategoConstructor _consLChoice_2;

  public static IStrategoConstructor _consRec_2;

  public static IStrategoConstructor _consWhere_1;

  public static IStrategoConstructor _consWith_1;

  public static IStrategoConstructor _consTest_1;

  public static IStrategoConstructor _consPrimNoArgs_1;

  public static IStrategoConstructor _consPrim_2;

  public static IStrategoConstructor _consStrCong_1;

  public static IStrategoConstructor _consIntCong_1;

  public static IStrategoConstructor _consRealCong_1;

  public static IStrategoConstructor _consCharCong_1;

  public static IStrategoConstructor _consCongQ_2;

  public static IStrategoConstructor _consAnnoCong_2;

  public static IStrategoConstructor _consEmptyTupleCong_0;

  public static IStrategoConstructor _consTupleCong_2;

  public static IStrategoConstructor _consListCongNoTail_1;

  public static IStrategoConstructor _consListCong_2;

  public static IStrategoConstructor _consExplodeCong_2;

  public static IStrategoConstructor _consCallNoArgs_1;

  public static IStrategoConstructor _consLRule_1;

  public static IStrategoConstructor _consSRule_1;

  public static IStrategoConstructor _consChoice_2;

  public static IStrategoConstructor _consRChoice_2;

  public static IStrategoConstructor _consCondChoice_3;

  public static IStrategoConstructor _consIfThen_2;

  public static IStrategoConstructor _consSwitchChoiceNoOtherwise_2;

  public static IStrategoConstructor _consSwitchChoice_3;

  public static IStrategoConstructor _consAM_2;

  public static IStrategoConstructor _consDynRuleScope_2;

  public static IStrategoConstructor _consGenDynRules_1;

  public static IStrategoConstructor _consDynRuleIntersectFix_2;

  public static IStrategoConstructor _consDynRuleUnionFix_2;

  public static IStrategoConstructor _consDynRuleIntersectUnionFix_3;

  public static IStrategoConstructor _consDynRuleIntersect_3;

  public static IStrategoConstructor _consDynRuleUnion_3;

  public static IStrategoConstructor _consDynRuleIntersectUnion_4;

  public static IStrategoConstructor _consSDefT_4;

  public static IStrategoConstructor _consExtSDefInl_4;

  public static IStrategoConstructor _consExtSDef_3;

  public static IStrategoConstructor _consSDefNoArgs_2;

  public static IStrategoConstructor _consSDef_3;

  public static IStrategoConstructor _consDefaultVarDec_1;

  public static IStrategoConstructor _consParenStrat_1;

  public static IStrategoConstructor _consModule_2;

  public static IStrategoConstructor _consSpecification_1;

  public static IStrategoConstructor _consImports_1;

  public static IStrategoConstructor _consStrategies_1;

  public static IStrategoConstructor _consSignature_1;

  public static IStrategoConstructor _consRules_1;

  public static IStrategoConstructor _consOverlays_1;

  public static IStrategoConstructor _consImport_1;

  public static IStrategoConstructor _consImportWildcard_1;

  public static IStrategoConstructor _consListVar_1;

  public static IStrategoConstructor _consStrategyCurly_1;

  public static IStrategoConstructor _consSwitchCase_2;

  public static IStrategoConstructor _consOverlayNoArgs_2;

  public static IStrategoConstructor _consOverlay_3;

  public static IStrategoConstructor _consRDefNoArgs_2;

  public static IStrategoConstructor _consRDef_3;

  public static IStrategoConstructor _consRDefT_4;

  public static IStrategoConstructor _consRuleNoCond_2;

  public static IStrategoConstructor _consRule_3;

  public static IStrategoConstructor _consWhereClause_1;

  public static IStrategoConstructor _consWithClause_1;

  public static IStrategoConstructor _consScopeLabels_1;

  public static IStrategoConstructor _consAddScopeLabel_2;

  public static IStrategoConstructor _consUndefineDynRule_2;

  public static IStrategoConstructor _consSetDynRule_2;

  public static IStrategoConstructor _consAddDynRule_2;

  public static IStrategoConstructor _consSetDynRuleMatch_2;

  public static IStrategoConstructor _consDynRuleAssign_2;

  public static IStrategoConstructor _consDynRuleAssignAdd_2;

  public static IStrategoConstructor _consSetDynRuleDepends_3;

  public static IStrategoConstructor _consLabeledDynRuleId_2;

  public static IStrategoConstructor _consAddLabelDynRuleId_2;

  public static IStrategoConstructor _consDynRuleId_1;

  public static IStrategoConstructor _consLabeledDynRuleScopeId_2;

  public static IStrategoConstructor _consDynRuleScopeId_1;

  public static IStrategoConstructor _consRDecNoArgs_1;

  public static IStrategoConstructor _consRDec_2;

  public static IStrategoConstructor _consRDecT_3;

  public static IStrategoConstructor _consRuleNames_1;

  public static IStrategoConstructor _consDR_DUMMY_0;

  public static IStrategoConstructor _consDR_UNDEFINE_1;

  public static IStrategoConstructor _consNamedEscape_1;

  public static IStrategoConstructor _consId_1;

  public static IStrategoConstructor _consPublic_0;

  public static IStrategoConstructor _consPrivate_0;

  public static IStrategoConstructor _consProtected_0;

  public static IStrategoConstructor _consAbstract_0;

  public static IStrategoConstructor _consFinal_0;

  public static IStrategoConstructor _consStatic_0;

  public static IStrategoConstructor _consNative_0;

  public static IStrategoConstructor _consTransient_0;

  public static IStrategoConstructor _consVolatile_0;

  public static IStrategoConstructor _consSynchronized_0;

  public static IStrategoConstructor _consStrictFP_0;

  public static IStrategoConstructor _consDeci_1;

  public static IStrategoConstructor _consHexa_1;

  public static IStrategoConstructor _consOcta_1;

  public static IStrategoConstructor _consFloat_1;

  public static IStrategoConstructor _consBool_1;

  public static IStrategoConstructor _consTrue_0;

  public static IStrategoConstructor _consFalse_0;

  public static IStrategoConstructor _consChar_1;

  public static IStrategoConstructor _consSingle_1;

  public static IStrategoConstructor _consString_1;

  public static IStrategoConstructor _consChars_1;

  public static IStrategoConstructor _consNull_0;

  public static IStrategoConstructor _consBoolean_0;

  public static IStrategoConstructor _consByte_0;

  public static IStrategoConstructor _consShort_0;

  public static IStrategoConstructor _consInt_0;

  public static IStrategoConstructor _consLong_0;

  public static IStrategoConstructor _consChar_0;

  public static IStrategoConstructor _consFloat_0;

  public static IStrategoConstructor _consDouble_0;

  public static IStrategoConstructor _consPackageName_1;

  public static IStrategoConstructor _consAmbName_1;

  public static IStrategoConstructor _consAmbName_2;

  public static IStrategoConstructor _consTypeName_1;

  public static IStrategoConstructor _consTypeName_2;

  public static IStrategoConstructor _consExprName_1;

  public static IStrategoConstructor _consExprName_2;

  public static IStrategoConstructor _consMethodName_1;

  public static IStrategoConstructor _consMethodName_2;

  public static IStrategoConstructor _consPackageOrTypeName_1;

  public static IStrategoConstructor _consPackageOrTypeName_2;

  public static IStrategoConstructor _consTypeArgs_1;

  public static IStrategoConstructor _consWildcard_1;

  public static IStrategoConstructor _consWildcardUpperBound_1;

  public static IStrategoConstructor _consWildcardLowerBound_1;

  public static IStrategoConstructor _consTypeParam_2;

  public static IStrategoConstructor _consTypeBound_1;

  public static IStrategoConstructor _consTypeParams_1;

  public static IStrategoConstructor _consClassOrInterfaceType_2;

  public static IStrategoConstructor _consClassType_2;

  public static IStrategoConstructor _consInterfaceType_2;

  public static IStrategoConstructor _consMember_3;

  public static IStrategoConstructor _consTypeVar_1;

  public static IStrategoConstructor _consArrayType_1;

  public static IStrategoConstructor _consLit_1;

  public static IStrategoConstructor _consThis_0;

  public static IStrategoConstructor _consQThis_1;

  public static IStrategoConstructor _consNewInstance_4;

  public static IStrategoConstructor _consQNewInstance_6;

  public static IStrategoConstructor _consInvoke_2;

  public static IStrategoConstructor _consPostIncr_1;

  public static IStrategoConstructor _consPostDecr_1;

  public static IStrategoConstructor _consPlus_1;

  public static IStrategoConstructor _consMinus_1;

  public static IStrategoConstructor _consPreIncr_1;

  public static IStrategoConstructor _consPreDecr_1;

  public static IStrategoConstructor _consComplement_1;

  public static IStrategoConstructor _consNot_1;

  public static IStrategoConstructor _consCastPrim_2;

  public static IStrategoConstructor _consCastRef_2;

  public static IStrategoConstructor _consInstanceOf_2;

  public static IStrategoConstructor _consMul_2;

  public static IStrategoConstructor _consDiv_2;

  public static IStrategoConstructor _consRemain_2;

  public static IStrategoConstructor _consPlus_2;

  public static IStrategoConstructor _consMinus_2;

  public static IStrategoConstructor _consLeftShift_2;

  public static IStrategoConstructor _consRightShift_2;

  public static IStrategoConstructor _consURightShift_2;

  public static IStrategoConstructor _consLt_2;

  public static IStrategoConstructor _consGt_2;

  public static IStrategoConstructor _consLtEq_2;

  public static IStrategoConstructor _consGtEq_2;

  public static IStrategoConstructor _consEq_2;

  public static IStrategoConstructor _consNotEq_2;

  public static IStrategoConstructor _consLazyAnd_2;

  public static IStrategoConstructor _consLazyOr_2;

  public static IStrategoConstructor _consAnd_2;

  public static IStrategoConstructor _consExcOr_2;

  public static IStrategoConstructor _consOr_2;

  public static IStrategoConstructor _consAssign_2;

  public static IStrategoConstructor _consAssignMul_2;

  public static IStrategoConstructor _consAssignDiv_2;

  public static IStrategoConstructor _consAssignRemain_2;

  public static IStrategoConstructor _consAssignPlus_2;

  public static IStrategoConstructor _consAssignMinus_2;

  public static IStrategoConstructor _consAssignLeftShift_2;

  public static IStrategoConstructor _consAssignRightShift_2;

  public static IStrategoConstructor _consAssignURightShift_2;

  public static IStrategoConstructor _consAssignAnd_2;

  public static IStrategoConstructor _consAssignExcOr_2;

  public static IStrategoConstructor _consAssignOr_2;

  public static IStrategoConstructor _consClass_1;

  public static IStrategoConstructor _consVoidClass_0;

  public static IStrategoConstructor _consArrayInit_1;

  public static IStrategoConstructor _consFieldDec_3;

  public static IStrategoConstructor _consVarDec_1;

  public static IStrategoConstructor _consVarDec_2;

  public static IStrategoConstructor _consArrayVarDecId_2;

  public static IStrategoConstructor _consDim_0;

  public static IStrategoConstructor _consLocalVarDecStm_1;

  public static IStrategoConstructor _consLocalVarDec_3;

  public static IStrategoConstructor _consEmpty_0;

  public static IStrategoConstructor _consLabeled_2;

  public static IStrategoConstructor _consExprStm_1;

  public static IStrategoConstructor _consIf_2;

  public static IStrategoConstructor _consIf_3;

  public static IStrategoConstructor _consAssertStm_1;

  public static IStrategoConstructor _consAssertStm_2;

  public static IStrategoConstructor _consSwitch_2;

  public static IStrategoConstructor _consWhile_2;

  public static IStrategoConstructor _consDoWhile_2;

  public static IStrategoConstructor _consFor_4;

  public static IStrategoConstructor _consForEach_3;

  public static IStrategoConstructor _consBreak_1;

  public static IStrategoConstructor _consContinue_1;

  public static IStrategoConstructor _consReturn_1;

  public static IStrategoConstructor _consThrow_1;

  public static IStrategoConstructor _consSynchronized_2;

  public static IStrategoConstructor _consTry_2;

  public static IStrategoConstructor _consTry_3;

  public static IStrategoConstructor _consSwitchBlock_2;

  public static IStrategoConstructor _consSwitchGroup_2;

  public static IStrategoConstructor _consCase_1;

  public static IStrategoConstructor _consDefault_0;

  public static IStrategoConstructor _consBlock_1;

  public static IStrategoConstructor _consClassDecStm_1;

  public static IStrategoConstructor _consMethodDec_2;

  public static IStrategoConstructor _consMethodDecHead_6;

  public static IStrategoConstructor _consDeprMethodDecHead_7;

  public static IStrategoConstructor _consVoid_0;

  public static IStrategoConstructor _consParam_3;

  public static IStrategoConstructor _consVarArityParam_3;

  public static IStrategoConstructor _consThrowsDec_1;

  public static IStrategoConstructor _consNoMethodBody_0;

  public static IStrategoConstructor _consInstanceInit_1;

  public static IStrategoConstructor _consStaticInit_1;

  public static IStrategoConstructor _consConstrDec_2;

  public static IStrategoConstructor _consConstrDecHead_5;

  public static IStrategoConstructor _consConstrBody_2;

  public static IStrategoConstructor _consAltConstrInv_2;

  public static IStrategoConstructor _consSuperConstrInv_2;

  public static IStrategoConstructor _consQSuperConstrInv_3;

  public static IStrategoConstructor _consEnumDec_2;

  public static IStrategoConstructor _consEnumDecHead_3;

  public static IStrategoConstructor _consEnumBody_2;

  public static IStrategoConstructor _consEnumConst_3;

  public static IStrategoConstructor _consEnumBodyDecs_1;

  public static IStrategoConstructor _consConstantDec_3;

  public static IStrategoConstructor _consAbstractMethodDec_6;

  public static IStrategoConstructor _consDeprAbstractMethodDec_7;

  public static IStrategoConstructor _consAnnoDec_2;

  public static IStrategoConstructor _consAnnoDecHead_2;

  public static IStrategoConstructor _consAnnoMethodDec_4;

  public static IStrategoConstructor _consDefaultVal_1;

  public static IStrategoConstructor _consInterfaceDec_2;

  public static IStrategoConstructor _consInterfaceDecHead_4;

  public static IStrategoConstructor _consExtendsInterfaces_1;

  public static IStrategoConstructor _consClassDec_2;

  public static IStrategoConstructor _consClassBody_1;

  public static IStrategoConstructor _consClassDecHead_5;

  public static IStrategoConstructor _consSuperDec_1;

  public static IStrategoConstructor _consImplementsDec_1;

  public static IStrategoConstructor _consNewArray_3;

  public static IStrategoConstructor _consUnboundWld_1;

  public static IStrategoConstructor _consDim_1;

  public static IStrategoConstructor _consField_2;

  public static IStrategoConstructor _consSuperField_1;

  public static IStrategoConstructor _consQSuperField_2;

  public static IStrategoConstructor _consMethod_1;

  public static IStrategoConstructor _consMethod_3;

  public static IStrategoConstructor _consSuperMethod_2;

  public static IStrategoConstructor _consQSuperMethod_3;

  public static IStrategoConstructor _consGenericMethod_3;

  public static IStrategoConstructor _consAnno_2;

  public static IStrategoConstructor _consSingleElemAnno_2;

  public static IStrategoConstructor _consMarkerAnno_1;

  public static IStrategoConstructor _consElemValPair_2;

  public static IStrategoConstructor _consElemValArrayInit_1;

  public static IStrategoConstructor _consPackageDec_2;

  public static IStrategoConstructor _consTypeImportDec_1;

  public static IStrategoConstructor _consTypeImportOnDemandDec_1;

  public static IStrategoConstructor _consStaticImportDec_2;

  public static IStrategoConstructor _consStaticImportOnDemandDec_1;

  public static IStrategoConstructor _consSemicolon_0;

  public static IStrategoConstructor _consSome_1;

  public static IStrategoConstructor _consImportAs_1;

  public static IStrategoConstructor _consTypeImportAsDec_2;

  public static IStrategoConstructor _consTransImportDec_2;

  public static IStrategoConstructor _consTransBody_1;

  public static IStrategoConstructor _consTransDecHead_2;

  public static IStrategoConstructor _consTransDec_2;

  public static IStrategoConstructor _consModelBody_1;

  public static IStrategoConstructor _consModelDecHead_3;

  public static IStrategoConstructor _consModelDec_2;

  public static IStrategoConstructor _consChecksBody_1;

  public static IStrategoConstructor _consChecksDecHead_2;

  public static IStrategoConstructor _consChecksDec_2;

  public static IStrategoConstructor _consEditorServicesBody_1;

  public static IStrategoConstructor _consEditorServicesDecHead_2;

  public static IStrategoConstructor _consEditorServicesDec_2;

  public static IStrategoConstructor _consSugarDecHead_2;

  public static IStrategoConstructor _consSugarDec_2;

  public static IStrategoConstructor _consSugarBody_1;

  public static IStrategoConstructor _consCompileError_2;

  public static IStrategoConstructor _consCompilationUnit_3;

  public static IStrategoConstructor _consPureDesugaring_1;

  public static IStrategoConstructor _consInjectDesugaring_4;

  public static IStrategoConstructor _consDesugarings_1;

  public static IStrategoConstructor _consgrammar_elem_1;

  public static IStrategoConstructor _constransformation_elem_1;

  public static IStrategoConstructor _consTransApp_2;

  public static IStrategoConstructor _consToModelTerm_1;

  public static Context init(Context context)
  { 
    synchronized(out.class)
    { 
      if(isIniting)
        return null;
      try
      { 
        isIniting = true;
        ITermFactory termFactory = context.getFactory();
        if(constantFactory == null)
        { 
          initConstructors(termFactory);
          initConstants(termFactory);
        }
        if(initedContext == null || initedContext.get() != context)
        { 
          org.strategoxt.stratego_lib.Main.init(context);
          context.registerComponent("renaming");
        }
        initedContext = new WeakReference<Context>(context);
        constantFactory = termFactory;
      }
      finally
      { 
        isIniting = false;
      }
      return context;
    }
  }

  public static Context init()
  { 
    return init(new Context());
  }

  public static Strategy getMainStrategy()
  { 
    return null;
  }

  public static void initConstructors(ITermFactory termFactory)
  { 
    _consConc_2 = termFactory.makeConstructor("Conc", 2);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consVar_1 = termFactory.makeConstructor("Var", 1);
    _consInt_1 = termFactory.makeConstructor("Int", 1);
    _consReal_1 = termFactory.makeConstructor("Real", 1);
    _consStr_1 = termFactory.makeConstructor("Str", 1);
    _consOp_2 = termFactory.makeConstructor("Op", 2);
    _consOpQ_2 = termFactory.makeConstructor("OpQ", 2);
    _consExplode_2 = termFactory.makeConstructor("Explode", 2);
    _consBuildDefaultPT_1 = termFactory.makeConstructor("BuildDefaultPT", 1);
    _consTuple_1 = termFactory.makeConstructor("Tuple", 1);
    _consList_1 = termFactory.makeConstructor("List", 1);
    _consListTail_2 = termFactory.makeConstructor("ListTail", 2);
    _consAs_2 = termFactory.makeConstructor("As", 2);
    _consBuildDefault_1 = termFactory.makeConstructor("BuildDefault", 1);
    _consAnnoList_2 = termFactory.makeConstructor("AnnoList", 2);
    _consNoAnnoList_1 = termFactory.makeConstructor("NoAnnoList", 1);
    _consApp_2 = termFactory.makeConstructor("App", 2);
    _consRootApp_1 = termFactory.makeConstructor("RootApp", 1);
    _consWld_0 = termFactory.makeConstructor("Wld", 0);
    _consSorts_1 = termFactory.makeConstructor("Sorts", 1);
    _consConstructors_1 = termFactory.makeConstructor("Constructors", 1);
    _consSortVar_1 = termFactory.makeConstructor("SortVar", 1);
    _consSortNoArgs_1 = termFactory.makeConstructor("SortNoArgs", 1);
    _consSort_2 = termFactory.makeConstructor("Sort", 2);
    _consSortList_1 = termFactory.makeConstructor("SortList", 1);
    _consSortListTl_2 = termFactory.makeConstructor("SortListTl", 2);
    _consSortTuple_1 = termFactory.makeConstructor("SortTuple", 1);
    _consOpDecl_2 = termFactory.makeConstructor("OpDecl", 2);
    _consOpDeclQ_2 = termFactory.makeConstructor("OpDeclQ", 2);
    _consOpDeclInj_1 = termFactory.makeConstructor("OpDeclInj", 1);
    _consExtOpDecl_2 = termFactory.makeConstructor("ExtOpDecl", 2);
    _consExtOpDeclQ_2 = termFactory.makeConstructor("ExtOpDeclQ", 2);
    _consExtOpDeclInj_1 = termFactory.makeConstructor("ExtOpDeclInj", 1);
    _consConstType_1 = termFactory.makeConstructor("ConstType", 1);
    _consFunType_2 = termFactory.makeConstructor("FunType", 2);
    _consSVar_1 = termFactory.makeConstructor("SVar", 1);
    _consLet_2 = termFactory.makeConstructor("Let", 2);
    _consCallT_3 = termFactory.makeConstructor("CallT", 3);
    _consCallDynamic_3 = termFactory.makeConstructor("CallDynamic", 3);
    _consFail_0 = termFactory.makeConstructor("Fail", 0);
    _consId_0 = termFactory.makeConstructor("Id", 0);
    _consMatch_1 = termFactory.makeConstructor("Match", 1);
    _consBuild_1 = termFactory.makeConstructor("Build", 1);
    _consScope_2 = termFactory.makeConstructor("Scope", 2);
    _consSeq_2 = termFactory.makeConstructor("Seq", 2);
    _consGuardedLChoice_3 = termFactory.makeConstructor("GuardedLChoice", 3);
    _consPrimT_3 = termFactory.makeConstructor("PrimT", 3);
    _consOne_1 = termFactory.makeConstructor("One", 1);
    _consAll_1 = termFactory.makeConstructor("All", 1);
    _consImportTerm_1 = termFactory.makeConstructor("ImportTerm", 1);
    _consCall_2 = termFactory.makeConstructor("Call", 2);
    _consScopeDefault_1 = termFactory.makeConstructor("ScopeDefault", 1);
    _consBA_2 = termFactory.makeConstructor("BA", 2);
    _consLChoice_2 = termFactory.makeConstructor("LChoice", 2);
    _consRec_2 = termFactory.makeConstructor("Rec", 2);
    _consWhere_1 = termFactory.makeConstructor("Where", 1);
    _consWith_1 = termFactory.makeConstructor("With", 1);
    _consTest_1 = termFactory.makeConstructor("Test", 1);
    _consPrimNoArgs_1 = termFactory.makeConstructor("PrimNoArgs", 1);
    _consPrim_2 = termFactory.makeConstructor("Prim", 2);
    _consStrCong_1 = termFactory.makeConstructor("StrCong", 1);
    _consIntCong_1 = termFactory.makeConstructor("IntCong", 1);
    _consRealCong_1 = termFactory.makeConstructor("RealCong", 1);
    _consCharCong_1 = termFactory.makeConstructor("CharCong", 1);
    _consCongQ_2 = termFactory.makeConstructor("CongQ", 2);
    _consAnnoCong_2 = termFactory.makeConstructor("AnnoCong", 2);
    _consEmptyTupleCong_0 = termFactory.makeConstructor("EmptyTupleCong", 0);
    _consTupleCong_2 = termFactory.makeConstructor("TupleCong", 2);
    _consListCongNoTail_1 = termFactory.makeConstructor("ListCongNoTail", 1);
    _consListCong_2 = termFactory.makeConstructor("ListCong", 2);
    _consExplodeCong_2 = termFactory.makeConstructor("ExplodeCong", 2);
    _consCallNoArgs_1 = termFactory.makeConstructor("CallNoArgs", 1);
    _consLRule_1 = termFactory.makeConstructor("LRule", 1);
    _consSRule_1 = termFactory.makeConstructor("SRule", 1);
    _consChoice_2 = termFactory.makeConstructor("Choice", 2);
    _consRChoice_2 = termFactory.makeConstructor("RChoice", 2);
    _consCondChoice_3 = termFactory.makeConstructor("CondChoice", 3);
    _consIfThen_2 = termFactory.makeConstructor("IfThen", 2);
    _consSwitchChoiceNoOtherwise_2 = termFactory.makeConstructor("SwitchChoiceNoOtherwise", 2);
    _consSwitchChoice_3 = termFactory.makeConstructor("SwitchChoice", 3);
    _consAM_2 = termFactory.makeConstructor("AM", 2);
    _consDynRuleScope_2 = termFactory.makeConstructor("DynRuleScope", 2);
    _consGenDynRules_1 = termFactory.makeConstructor("GenDynRules", 1);
    _consDynRuleIntersectFix_2 = termFactory.makeConstructor("DynRuleIntersectFix", 2);
    _consDynRuleUnionFix_2 = termFactory.makeConstructor("DynRuleUnionFix", 2);
    _consDynRuleIntersectUnionFix_3 = termFactory.makeConstructor("DynRuleIntersectUnionFix", 3);
    _consDynRuleIntersect_3 = termFactory.makeConstructor("DynRuleIntersect", 3);
    _consDynRuleUnion_3 = termFactory.makeConstructor("DynRuleUnion", 3);
    _consDynRuleIntersectUnion_4 = termFactory.makeConstructor("DynRuleIntersectUnion", 4);
    _consSDefT_4 = termFactory.makeConstructor("SDefT", 4);
    _consExtSDefInl_4 = termFactory.makeConstructor("ExtSDefInl", 4);
    _consExtSDef_3 = termFactory.makeConstructor("ExtSDef", 3);
    _consSDefNoArgs_2 = termFactory.makeConstructor("SDefNoArgs", 2);
    _consSDef_3 = termFactory.makeConstructor("SDef", 3);
    _consDefaultVarDec_1 = termFactory.makeConstructor("DefaultVarDec", 1);
    _consParenStrat_1 = termFactory.makeConstructor("ParenStrat", 1);
    _consModule_2 = termFactory.makeConstructor("Module", 2);
    _consSpecification_1 = termFactory.makeConstructor("Specification", 1);
    _consImports_1 = termFactory.makeConstructor("Imports", 1);
    _consStrategies_1 = termFactory.makeConstructor("Strategies", 1);
    _consSignature_1 = termFactory.makeConstructor("Signature", 1);
    _consRules_1 = termFactory.makeConstructor("Rules", 1);
    _consOverlays_1 = termFactory.makeConstructor("Overlays", 1);
    _consImport_1 = termFactory.makeConstructor("Import", 1);
    _consImportWildcard_1 = termFactory.makeConstructor("ImportWildcard", 1);
    _consListVar_1 = termFactory.makeConstructor("ListVar", 1);
    _consStrategyCurly_1 = termFactory.makeConstructor("StrategyCurly", 1);
    _consSwitchCase_2 = termFactory.makeConstructor("SwitchCase", 2);
    _consOverlayNoArgs_2 = termFactory.makeConstructor("OverlayNoArgs", 2);
    _consOverlay_3 = termFactory.makeConstructor("Overlay", 3);
    _consRDefNoArgs_2 = termFactory.makeConstructor("RDefNoArgs", 2);
    _consRDef_3 = termFactory.makeConstructor("RDef", 3);
    _consRDefT_4 = termFactory.makeConstructor("RDefT", 4);
    _consRuleNoCond_2 = termFactory.makeConstructor("RuleNoCond", 2);
    _consRule_3 = termFactory.makeConstructor("Rule", 3);
    _consWhereClause_1 = termFactory.makeConstructor("WhereClause", 1);
    _consWithClause_1 = termFactory.makeConstructor("WithClause", 1);
    _consScopeLabels_1 = termFactory.makeConstructor("ScopeLabels", 1);
    _consAddScopeLabel_2 = termFactory.makeConstructor("AddScopeLabel", 2);
    _consUndefineDynRule_2 = termFactory.makeConstructor("UndefineDynRule", 2);
    _consSetDynRule_2 = termFactory.makeConstructor("SetDynRule", 2);
    _consAddDynRule_2 = termFactory.makeConstructor("AddDynRule", 2);
    _consSetDynRuleMatch_2 = termFactory.makeConstructor("SetDynRuleMatch", 2);
    _consDynRuleAssign_2 = termFactory.makeConstructor("DynRuleAssign", 2);
    _consDynRuleAssignAdd_2 = termFactory.makeConstructor("DynRuleAssignAdd", 2);
    _consSetDynRuleDepends_3 = termFactory.makeConstructor("SetDynRuleDepends", 3);
    _consLabeledDynRuleId_2 = termFactory.makeConstructor("LabeledDynRuleId", 2);
    _consAddLabelDynRuleId_2 = termFactory.makeConstructor("AddLabelDynRuleId", 2);
    _consDynRuleId_1 = termFactory.makeConstructor("DynRuleId", 1);
    _consLabeledDynRuleScopeId_2 = termFactory.makeConstructor("LabeledDynRuleScopeId", 2);
    _consDynRuleScopeId_1 = termFactory.makeConstructor("DynRuleScopeId", 1);
    _consRDecNoArgs_1 = termFactory.makeConstructor("RDecNoArgs", 1);
    _consRDec_2 = termFactory.makeConstructor("RDec", 2);
    _consRDecT_3 = termFactory.makeConstructor("RDecT", 3);
    _consRuleNames_1 = termFactory.makeConstructor("RuleNames", 1);
    _consDR_DUMMY_0 = termFactory.makeConstructor("DR_DUMMY", 0);
    _consDR_UNDEFINE_1 = termFactory.makeConstructor("DR_UNDEFINE", 1);
    _consNamedEscape_1 = termFactory.makeConstructor("NamedEscape", 1);
    _consId_1 = termFactory.makeConstructor("Id", 1);
    _consPublic_0 = termFactory.makeConstructor("Public", 0);
    _consPrivate_0 = termFactory.makeConstructor("Private", 0);
    _consProtected_0 = termFactory.makeConstructor("Protected", 0);
    _consAbstract_0 = termFactory.makeConstructor("Abstract", 0);
    _consFinal_0 = termFactory.makeConstructor("Final", 0);
    _consStatic_0 = termFactory.makeConstructor("Static", 0);
    _consNative_0 = termFactory.makeConstructor("Native", 0);
    _consTransient_0 = termFactory.makeConstructor("Transient", 0);
    _consVolatile_0 = termFactory.makeConstructor("Volatile", 0);
    _consSynchronized_0 = termFactory.makeConstructor("Synchronized", 0);
    _consStrictFP_0 = termFactory.makeConstructor("StrictFP", 0);
    _consDeci_1 = termFactory.makeConstructor("Deci", 1);
    _consHexa_1 = termFactory.makeConstructor("Hexa", 1);
    _consOcta_1 = termFactory.makeConstructor("Octa", 1);
    _consFloat_1 = termFactory.makeConstructor("Float", 1);
    _consBool_1 = termFactory.makeConstructor("Bool", 1);
    _consTrue_0 = termFactory.makeConstructor("True", 0);
    _consFalse_0 = termFactory.makeConstructor("False", 0);
    _consChar_1 = termFactory.makeConstructor("Char", 1);
    _consSingle_1 = termFactory.makeConstructor("Single", 1);
    _consString_1 = termFactory.makeConstructor("String", 1);
    _consChars_1 = termFactory.makeConstructor("Chars", 1);
    _consNull_0 = termFactory.makeConstructor("Null", 0);
    _consBoolean_0 = termFactory.makeConstructor("Boolean", 0);
    _consByte_0 = termFactory.makeConstructor("Byte", 0);
    _consShort_0 = termFactory.makeConstructor("Short", 0);
    _consInt_0 = termFactory.makeConstructor("Int", 0);
    _consLong_0 = termFactory.makeConstructor("Long", 0);
    _consChar_0 = termFactory.makeConstructor("Char", 0);
    _consFloat_0 = termFactory.makeConstructor("Float", 0);
    _consDouble_0 = termFactory.makeConstructor("Double", 0);
    _consPackageName_1 = termFactory.makeConstructor("PackageName", 1);
    _consAmbName_1 = termFactory.makeConstructor("AmbName", 1);
    _consAmbName_2 = termFactory.makeConstructor("AmbName", 2);
    _consTypeName_1 = termFactory.makeConstructor("TypeName", 1);
    _consTypeName_2 = termFactory.makeConstructor("TypeName", 2);
    _consExprName_1 = termFactory.makeConstructor("ExprName", 1);
    _consExprName_2 = termFactory.makeConstructor("ExprName", 2);
    _consMethodName_1 = termFactory.makeConstructor("MethodName", 1);
    _consMethodName_2 = termFactory.makeConstructor("MethodName", 2);
    _consPackageOrTypeName_1 = termFactory.makeConstructor("PackageOrTypeName", 1);
    _consPackageOrTypeName_2 = termFactory.makeConstructor("PackageOrTypeName", 2);
    _consTypeArgs_1 = termFactory.makeConstructor("TypeArgs", 1);
    _consWildcard_1 = termFactory.makeConstructor("Wildcard", 1);
    _consWildcardUpperBound_1 = termFactory.makeConstructor("WildcardUpperBound", 1);
    _consWildcardLowerBound_1 = termFactory.makeConstructor("WildcardLowerBound", 1);
    _consTypeParam_2 = termFactory.makeConstructor("TypeParam", 2);
    _consTypeBound_1 = termFactory.makeConstructor("TypeBound", 1);
    _consTypeParams_1 = termFactory.makeConstructor("TypeParams", 1);
    _consClassOrInterfaceType_2 = termFactory.makeConstructor("ClassOrInterfaceType", 2);
    _consClassType_2 = termFactory.makeConstructor("ClassType", 2);
    _consInterfaceType_2 = termFactory.makeConstructor("InterfaceType", 2);
    _consMember_3 = termFactory.makeConstructor("Member", 3);
    _consTypeVar_1 = termFactory.makeConstructor("TypeVar", 1);
    _consArrayType_1 = termFactory.makeConstructor("ArrayType", 1);
    _consLit_1 = termFactory.makeConstructor("Lit", 1);
    _consThis_0 = termFactory.makeConstructor("This", 0);
    _consQThis_1 = termFactory.makeConstructor("QThis", 1);
    _consNewInstance_4 = termFactory.makeConstructor("NewInstance", 4);
    _consQNewInstance_6 = termFactory.makeConstructor("QNewInstance", 6);
    _consInvoke_2 = termFactory.makeConstructor("Invoke", 2);
    _consPostIncr_1 = termFactory.makeConstructor("PostIncr", 1);
    _consPostDecr_1 = termFactory.makeConstructor("PostDecr", 1);
    _consPlus_1 = termFactory.makeConstructor("Plus", 1);
    _consMinus_1 = termFactory.makeConstructor("Minus", 1);
    _consPreIncr_1 = termFactory.makeConstructor("PreIncr", 1);
    _consPreDecr_1 = termFactory.makeConstructor("PreDecr", 1);
    _consComplement_1 = termFactory.makeConstructor("Complement", 1);
    _consNot_1 = termFactory.makeConstructor("Not", 1);
    _consCastPrim_2 = termFactory.makeConstructor("CastPrim", 2);
    _consCastRef_2 = termFactory.makeConstructor("CastRef", 2);
    _consInstanceOf_2 = termFactory.makeConstructor("InstanceOf", 2);
    _consMul_2 = termFactory.makeConstructor("Mul", 2);
    _consDiv_2 = termFactory.makeConstructor("Div", 2);
    _consRemain_2 = termFactory.makeConstructor("Remain", 2);
    _consPlus_2 = termFactory.makeConstructor("Plus", 2);
    _consMinus_2 = termFactory.makeConstructor("Minus", 2);
    _consLeftShift_2 = termFactory.makeConstructor("LeftShift", 2);
    _consRightShift_2 = termFactory.makeConstructor("RightShift", 2);
    _consURightShift_2 = termFactory.makeConstructor("URightShift", 2);
    _consLt_2 = termFactory.makeConstructor("Lt", 2);
    _consGt_2 = termFactory.makeConstructor("Gt", 2);
    _consLtEq_2 = termFactory.makeConstructor("LtEq", 2);
    _consGtEq_2 = termFactory.makeConstructor("GtEq", 2);
    _consEq_2 = termFactory.makeConstructor("Eq", 2);
    _consNotEq_2 = termFactory.makeConstructor("NotEq", 2);
    _consLazyAnd_2 = termFactory.makeConstructor("LazyAnd", 2);
    _consLazyOr_2 = termFactory.makeConstructor("LazyOr", 2);
    _consAnd_2 = termFactory.makeConstructor("And", 2);
    _consExcOr_2 = termFactory.makeConstructor("ExcOr", 2);
    _consOr_2 = termFactory.makeConstructor("Or", 2);
    _consAssign_2 = termFactory.makeConstructor("Assign", 2);
    _consAssignMul_2 = termFactory.makeConstructor("AssignMul", 2);
    _consAssignDiv_2 = termFactory.makeConstructor("AssignDiv", 2);
    _consAssignRemain_2 = termFactory.makeConstructor("AssignRemain", 2);
    _consAssignPlus_2 = termFactory.makeConstructor("AssignPlus", 2);
    _consAssignMinus_2 = termFactory.makeConstructor("AssignMinus", 2);
    _consAssignLeftShift_2 = termFactory.makeConstructor("AssignLeftShift", 2);
    _consAssignRightShift_2 = termFactory.makeConstructor("AssignRightShift", 2);
    _consAssignURightShift_2 = termFactory.makeConstructor("AssignURightShift", 2);
    _consAssignAnd_2 = termFactory.makeConstructor("AssignAnd", 2);
    _consAssignExcOr_2 = termFactory.makeConstructor("AssignExcOr", 2);
    _consAssignOr_2 = termFactory.makeConstructor("AssignOr", 2);
    _consClass_1 = termFactory.makeConstructor("Class", 1);
    _consVoidClass_0 = termFactory.makeConstructor("VoidClass", 0);
    _consArrayInit_1 = termFactory.makeConstructor("ArrayInit", 1);
    _consFieldDec_3 = termFactory.makeConstructor("FieldDec", 3);
    _consVarDec_1 = termFactory.makeConstructor("VarDec", 1);
    _consVarDec_2 = termFactory.makeConstructor("VarDec", 2);
    _consArrayVarDecId_2 = termFactory.makeConstructor("ArrayVarDecId", 2);
    _consDim_0 = termFactory.makeConstructor("Dim", 0);
    _consLocalVarDecStm_1 = termFactory.makeConstructor("LocalVarDecStm", 1);
    _consLocalVarDec_3 = termFactory.makeConstructor("LocalVarDec", 3);
    _consEmpty_0 = termFactory.makeConstructor("Empty", 0);
    _consLabeled_2 = termFactory.makeConstructor("Labeled", 2);
    _consExprStm_1 = termFactory.makeConstructor("ExprStm", 1);
    _consIf_2 = termFactory.makeConstructor("If", 2);
    _consIf_3 = termFactory.makeConstructor("If", 3);
    _consAssertStm_1 = termFactory.makeConstructor("AssertStm", 1);
    _consAssertStm_2 = termFactory.makeConstructor("AssertStm", 2);
    _consSwitch_2 = termFactory.makeConstructor("Switch", 2);
    _consWhile_2 = termFactory.makeConstructor("While", 2);
    _consDoWhile_2 = termFactory.makeConstructor("DoWhile", 2);
    _consFor_4 = termFactory.makeConstructor("For", 4);
    _consForEach_3 = termFactory.makeConstructor("ForEach", 3);
    _consBreak_1 = termFactory.makeConstructor("Break", 1);
    _consContinue_1 = termFactory.makeConstructor("Continue", 1);
    _consReturn_1 = termFactory.makeConstructor("Return", 1);
    _consThrow_1 = termFactory.makeConstructor("Throw", 1);
    _consSynchronized_2 = termFactory.makeConstructor("Synchronized", 2);
    _consTry_2 = termFactory.makeConstructor("Try", 2);
    _consTry_3 = termFactory.makeConstructor("Try", 3);
    _consSwitchBlock_2 = termFactory.makeConstructor("SwitchBlock", 2);
    _consSwitchGroup_2 = termFactory.makeConstructor("SwitchGroup", 2);
    _consCase_1 = termFactory.makeConstructor("Case", 1);
    _consDefault_0 = termFactory.makeConstructor("Default", 0);
    _consBlock_1 = termFactory.makeConstructor("Block", 1);
    _consClassDecStm_1 = termFactory.makeConstructor("ClassDecStm", 1);
    _consMethodDec_2 = termFactory.makeConstructor("MethodDec", 2);
    _consMethodDecHead_6 = termFactory.makeConstructor("MethodDecHead", 6);
    _consDeprMethodDecHead_7 = termFactory.makeConstructor("DeprMethodDecHead", 7);
    _consVoid_0 = termFactory.makeConstructor("Void", 0);
    _consParam_3 = termFactory.makeConstructor("Param", 3);
    _consVarArityParam_3 = termFactory.makeConstructor("VarArityParam", 3);
    _consThrowsDec_1 = termFactory.makeConstructor("ThrowsDec", 1);
    _consNoMethodBody_0 = termFactory.makeConstructor("NoMethodBody", 0);
    _consInstanceInit_1 = termFactory.makeConstructor("InstanceInit", 1);
    _consStaticInit_1 = termFactory.makeConstructor("StaticInit", 1);
    _consConstrDec_2 = termFactory.makeConstructor("ConstrDec", 2);
    _consConstrDecHead_5 = termFactory.makeConstructor("ConstrDecHead", 5);
    _consConstrBody_2 = termFactory.makeConstructor("ConstrBody", 2);
    _consAltConstrInv_2 = termFactory.makeConstructor("AltConstrInv", 2);
    _consSuperConstrInv_2 = termFactory.makeConstructor("SuperConstrInv", 2);
    _consQSuperConstrInv_3 = termFactory.makeConstructor("QSuperConstrInv", 3);
    _consEnumDec_2 = termFactory.makeConstructor("EnumDec", 2);
    _consEnumDecHead_3 = termFactory.makeConstructor("EnumDecHead", 3);
    _consEnumBody_2 = termFactory.makeConstructor("EnumBody", 2);
    _consEnumConst_3 = termFactory.makeConstructor("EnumConst", 3);
    _consEnumBodyDecs_1 = termFactory.makeConstructor("EnumBodyDecs", 1);
    _consConstantDec_3 = termFactory.makeConstructor("ConstantDec", 3);
    _consAbstractMethodDec_6 = termFactory.makeConstructor("AbstractMethodDec", 6);
    _consDeprAbstractMethodDec_7 = termFactory.makeConstructor("DeprAbstractMethodDec", 7);
    _consAnnoDec_2 = termFactory.makeConstructor("AnnoDec", 2);
    _consAnnoDecHead_2 = termFactory.makeConstructor("AnnoDecHead", 2);
    _consAnnoMethodDec_4 = termFactory.makeConstructor("AnnoMethodDec", 4);
    _consDefaultVal_1 = termFactory.makeConstructor("DefaultVal", 1);
    _consInterfaceDec_2 = termFactory.makeConstructor("InterfaceDec", 2);
    _consInterfaceDecHead_4 = termFactory.makeConstructor("InterfaceDecHead", 4);
    _consExtendsInterfaces_1 = termFactory.makeConstructor("ExtendsInterfaces", 1);
    _consClassDec_2 = termFactory.makeConstructor("ClassDec", 2);
    _consClassBody_1 = termFactory.makeConstructor("ClassBody", 1);
    _consClassDecHead_5 = termFactory.makeConstructor("ClassDecHead", 5);
    _consSuperDec_1 = termFactory.makeConstructor("SuperDec", 1);
    _consImplementsDec_1 = termFactory.makeConstructor("ImplementsDec", 1);
    _consNewArray_3 = termFactory.makeConstructor("NewArray", 3);
    _consUnboundWld_1 = termFactory.makeConstructor("UnboundWld", 1);
    _consDim_1 = termFactory.makeConstructor("Dim", 1);
    _consField_2 = termFactory.makeConstructor("Field", 2);
    _consSuperField_1 = termFactory.makeConstructor("SuperField", 1);
    _consQSuperField_2 = termFactory.makeConstructor("QSuperField", 2);
    _consMethod_1 = termFactory.makeConstructor("Method", 1);
    _consMethod_3 = termFactory.makeConstructor("Method", 3);
    _consSuperMethod_2 = termFactory.makeConstructor("SuperMethod", 2);
    _consQSuperMethod_3 = termFactory.makeConstructor("QSuperMethod", 3);
    _consGenericMethod_3 = termFactory.makeConstructor("GenericMethod", 3);
    _consAnno_2 = termFactory.makeConstructor("Anno", 2);
    _consSingleElemAnno_2 = termFactory.makeConstructor("SingleElemAnno", 2);
    _consMarkerAnno_1 = termFactory.makeConstructor("MarkerAnno", 1);
    _consElemValPair_2 = termFactory.makeConstructor("ElemValPair", 2);
    _consElemValArrayInit_1 = termFactory.makeConstructor("ElemValArrayInit", 1);
    _consPackageDec_2 = termFactory.makeConstructor("PackageDec", 2);
    _consTypeImportDec_1 = termFactory.makeConstructor("TypeImportDec", 1);
    _consTypeImportOnDemandDec_1 = termFactory.makeConstructor("TypeImportOnDemandDec", 1);
    _consStaticImportDec_2 = termFactory.makeConstructor("StaticImportDec", 2);
    _consStaticImportOnDemandDec_1 = termFactory.makeConstructor("StaticImportOnDemandDec", 1);
    _consSemicolon_0 = termFactory.makeConstructor("Semicolon", 0);
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consImportAs_1 = termFactory.makeConstructor("ImportAs", 1);
    _consTypeImportAsDec_2 = termFactory.makeConstructor("TypeImportAsDec", 2);
    _consTransImportDec_2 = termFactory.makeConstructor("TransImportDec", 2);
    _consTransBody_1 = termFactory.makeConstructor("TransBody", 1);
    _consTransDecHead_2 = termFactory.makeConstructor("TransDecHead", 2);
    _consTransDec_2 = termFactory.makeConstructor("TransDec", 2);
    _consModelBody_1 = termFactory.makeConstructor("ModelBody", 1);
    _consModelDecHead_3 = termFactory.makeConstructor("ModelDecHead", 3);
    _consModelDec_2 = termFactory.makeConstructor("ModelDec", 2);
    _consChecksBody_1 = termFactory.makeConstructor("ChecksBody", 1);
    _consChecksDecHead_2 = termFactory.makeConstructor("ChecksDecHead", 2);
    _consChecksDec_2 = termFactory.makeConstructor("ChecksDec", 2);
    _consEditorServicesBody_1 = termFactory.makeConstructor("EditorServicesBody", 1);
    _consEditorServicesDecHead_2 = termFactory.makeConstructor("EditorServicesDecHead", 2);
    _consEditorServicesDec_2 = termFactory.makeConstructor("EditorServicesDec", 2);
    _consSugarDecHead_2 = termFactory.makeConstructor("SugarDecHead", 2);
    _consSugarDec_2 = termFactory.makeConstructor("SugarDec", 2);
    _consSugarBody_1 = termFactory.makeConstructor("SugarBody", 1);
    _consCompileError_2 = termFactory.makeConstructor("CompileError", 2);
    _consCompilationUnit_3 = termFactory.makeConstructor("CompilationUnit", 3);
    _consPureDesugaring_1 = termFactory.makeConstructor("PureDesugaring", 1);
    _consInjectDesugaring_4 = termFactory.makeConstructor("InjectDesugaring", 4);
    _consDesugarings_1 = termFactory.makeConstructor("Desugarings", 1);
    _consgrammar_elem_1 = termFactory.makeConstructor("grammar-elem", 1);
    _constransformation_elem_1 = termFactory.makeConstructor("transformation-elem", 1);
    _consTransApp_2 = termFactory.makeConstructor("TransApp", 2);
    _consToModelTerm_1 = termFactory.makeConstructor("ToModelTerm", 1);
  }

  public static void initConstants(ITermFactory termFactory)
  { }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}