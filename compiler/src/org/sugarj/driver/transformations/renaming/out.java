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

  public static IStrategoConstructor _consSome_1;

  public static IStrategoConstructor _consDR_DUMMY_0;

  public static IStrategoConstructor _consDR_UNDEFINE_1;

  public static IStrategoConstructor _consVar_1;

  public static IStrategoConstructor _consInt_1;

  public static IStrategoConstructor _consReal_1;

  public static IStrategoConstructor _consStr_1;

  public static IStrategoConstructor _consOp_2;

  public static IStrategoConstructor _consOpQ_2;

  public static IStrategoConstructor _consExplode_2;

  public static IStrategoConstructor _consBuildDefaultPT_1;

  public static IStrategoConstructor _consChar_1;

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

  public static IStrategoConstructor _consNot_1;

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

  public static IStrategoConstructor _consAssign_2;

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

  public static IStrategoConstructor _consVarDec_2;

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
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consDR_DUMMY_0 = termFactory.makeConstructor("DR_DUMMY", 0);
    _consDR_UNDEFINE_1 = termFactory.makeConstructor("DR_UNDEFINE", 1);
    _consVar_1 = termFactory.makeConstructor("Var", 1);
    _consInt_1 = termFactory.makeConstructor("Int", 1);
    _consReal_1 = termFactory.makeConstructor("Real", 1);
    _consStr_1 = termFactory.makeConstructor("Str", 1);
    _consOp_2 = termFactory.makeConstructor("Op", 2);
    _consOpQ_2 = termFactory.makeConstructor("OpQ", 2);
    _consExplode_2 = termFactory.makeConstructor("Explode", 2);
    _consBuildDefaultPT_1 = termFactory.makeConstructor("BuildDefaultPT", 1);
    _consChar_1 = termFactory.makeConstructor("Char", 1);
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
    _consNot_1 = termFactory.makeConstructor("Not", 1);
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
    _consAssign_2 = termFactory.makeConstructor("Assign", 2);
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
    _consVarDec_2 = termFactory.makeConstructor("VarDec", 2);
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
  }

  public static void initConstants(ITermFactory termFactory)
  { }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}