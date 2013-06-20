package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class ext_out  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm constCallNoArgs0;

  protected static IStrategoTerm constSVar0;

  protected static IStrategoTerm const1;

  protected static IStrategoTerm const0;

  protected static IStrategoTerm constempty_grammar0;

  protected static IStrategoTerm constNil0;

  public static IStrategoConstructor _consConc_2;

  public static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consSome_1;

  public static IStrategoConstructor _conssorts_1;

  public static IStrategoConstructor _consid_1;

  public static IStrategoConstructor _consmodule_3;

  public static IStrategoConstructor _consmodule_1;

  public static IStrategoConstructor _consDR_DUMMY_0;

  public static IStrategoConstructor _consDR_UNDEFINE_1;

  public static IStrategoConstructor _consnatural_1;

  public static IStrategoConstructor _conspositive_1;

  public static IStrategoConstructor _consnegative_1;

  public static IStrategoConstructor _consreal_con_3;

  public static IStrategoConstructor _consint_1;

  public static IStrategoConstructor _consreal_1;

  public static IStrategoConstructor _consfun_1;

  public static IStrategoConstructor _consappl_2;

  public static IStrategoConstructor _consplaceholder_1;

  public static IStrategoConstructor _consannotated_2;

  public static IStrategoConstructor _consempty_grammar_0;

  public static IStrategoConstructor _consconc_grammars_2;

  public static IStrategoConstructor _conssyntax_1;

  public static IStrategoConstructor _conslexical_syntax_1;

  public static IStrategoConstructor _conscontext_free_syntax_1;

  public static IStrategoConstructor _consvariables_1;

  public static IStrategoConstructor _conslexical_variables_1;

  public static IStrategoConstructor _consimp_section_1;

  public static IStrategoConstructor _conspriorities_1;

  public static IStrategoConstructor _conskernel_start_symbols_1;

  public static IStrategoConstructor _conslexical_start_symbols_1;

  public static IStrategoConstructor _conscontext_free_start_symbols_1;

  public static IStrategoConstructor _consrestrictions_1;

  public static IStrategoConstructor _consaliases_1;

  public static IStrategoConstructor _conslexical_priorities_1;

  public static IStrategoConstructor _conscontext_free_priorities_1;

  public static IStrategoConstructor _conslexical_restrictions_1;

  public static IStrategoConstructor _conscontext_free_restrictions_1;

  public static IStrategoConstructor _consterm_1;

  public static IStrategoConstructor _consbracket_0;

  public static IStrategoConstructor _consassoc_1;

  public static IStrategoConstructor _consreject_0;

  public static IStrategoConstructor _consprefer_0;

  public static IStrategoConstructor _consavoid_0;

  public static IStrategoConstructor _consattrs_1;

  public static IStrategoConstructor _consno_attrs_0;

  public static IStrategoConstructor _consprod_3;

  public static IStrategoConstructor _consprefix_fun_4;

  public static IStrategoConstructor _conscf_1;

  public static IStrategoConstructor _conslex_1;

  public static IStrategoConstructor _consvarsym_1;

  public static IStrategoConstructor _conslayout_0;

  public static IStrategoConstructor _consempty_0;

  public static IStrategoConstructor _consopt_1;

  public static IStrategoConstructor _consiter_1;

  public static IStrategoConstructor _consiter_star_1;

  public static IStrategoConstructor _consiter_sep_2;

  public static IStrategoConstructor _consiter_star_sep_2;

  public static IStrategoConstructor _constuple_2;

  public static IStrategoConstructor _consfunc_2;

  public static IStrategoConstructor _consstrategy_2;

  public static IStrategoConstructor _conslifting_1;

  public static IStrategoConstructor _conssort_1;

  public static IStrategoConstructor _consparameterized_sort_2;

  public static IStrategoConstructor _conslit_1;

  public static IStrategoConstructor _consci_lit_1;

  public static IStrategoConstructor _conslabel_2;

  public static IStrategoConstructor _consstart_0;

  public static IStrategoConstructor _consfile_start_0;

  public static IStrategoConstructor _consrenamings_1;

  public static IStrategoConstructor _conssymbol_2;

  public static IStrategoConstructor _consproduction_2;

  public static IStrategoConstructor _consexports_1;

  public static IStrategoConstructor _conshiddens_1;

  public static IStrategoConstructor _consunparameterized_1;

  public static IStrategoConstructor _consparameterized_2;

  public static IStrategoConstructor _consimports_1;

  public static IStrategoConstructor _consrenamed_module_2;

  public static IStrategoConstructor _consleft_0;

  public static IStrategoConstructor _consright_0;

  public static IStrategoConstructor _consnon_assoc_0;

  public static IStrategoConstructor _consassoc_0;

  public static IStrategoConstructor _consdefault_1;

  public static IStrategoConstructor _conswith_arguments_2;

  public static IStrategoConstructor _consnon_transitive_1;

  public static IStrategoConstructor _conssimple_group_1;

  public static IStrategoConstructor _consprods_group_1;

  public static IStrategoConstructor _consassoc_group_2;

  public static IStrategoConstructor _conschain_1;

  public static IStrategoConstructor _consassoc_3;

  public static IStrategoConstructor _consnumeric_1;

  public static IStrategoConstructor _consshort_1;

  public static IStrategoConstructor _constop_0;

  public static IStrategoConstructor _conseof_0;

  public static IStrategoConstructor _consbot_0;

  public static IStrategoConstructor _conslabel_start_0;

  public static IStrategoConstructor _consrange_2;

  public static IStrategoConstructor _consconc_2;

  public static IStrategoConstructor _consabsent_0;

  public static IStrategoConstructor _conspresent_1;

  public static IStrategoConstructor _conssimple_charclass_1;

  public static IStrategoConstructor _conscomp_1;

  public static IStrategoConstructor _consdiff_2;

  public static IStrategoConstructor _consisect_2;

  public static IStrategoConstructor _consunion_2;

  public static IStrategoConstructor _consunquoted_fun_1;

  public static IStrategoConstructor _consquoted_fun_1;

  public static IStrategoConstructor _consquoted_1;

  public static IStrategoConstructor _consunquoted_1;

  public static IStrategoConstructor _conschar_class_1;

  public static IStrategoConstructor _consseq_2;

  public static IStrategoConstructor _conssingle_1;

  public static IStrategoConstructor _consalt_2;

  public static IStrategoConstructor _conslist_1;

  public static IStrategoConstructor _consfollow_2;

  public static IStrategoConstructor _consalias_2;

  public static IStrategoConstructor _consdefinition_1;

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

  public static IStrategoConstructor _consAnalyses_1;

  public static IStrategoConstructor _consPureDesugaring_1;

  public static IStrategoConstructor _consInjectDesugaring_4;

  public static IStrategoConstructor _consDesugarings_1;

  public static IStrategoConstructor _conseditor_elem_1;

  public static IStrategoConstructor _consgrammar_elem_1;

  public static IStrategoConstructor _constransformation_elem_1;

  public static IStrategoConstructor _consTransformationDef_2;

  public static IStrategoConstructor _consTransApp_2;

  public static Context init(Context context)
  { 
    synchronized(ext_out.class)
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
          context.registerComponent("extraction");
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
    _conssorts_1 = termFactory.makeConstructor("sorts", 1);
    _consid_1 = termFactory.makeConstructor("id", 1);
    _consmodule_3 = termFactory.makeConstructor("module", 3);
    _consmodule_1 = termFactory.makeConstructor("module", 1);
    _consDR_DUMMY_0 = termFactory.makeConstructor("DR_DUMMY", 0);
    _consDR_UNDEFINE_1 = termFactory.makeConstructor("DR_UNDEFINE", 1);
    _consnatural_1 = termFactory.makeConstructor("natural", 1);
    _conspositive_1 = termFactory.makeConstructor("positive", 1);
    _consnegative_1 = termFactory.makeConstructor("negative", 1);
    _consreal_con_3 = termFactory.makeConstructor("real-con", 3);
    _consint_1 = termFactory.makeConstructor("int", 1);
    _consreal_1 = termFactory.makeConstructor("real", 1);
    _consfun_1 = termFactory.makeConstructor("fun", 1);
    _consappl_2 = termFactory.makeConstructor("appl", 2);
    _consplaceholder_1 = termFactory.makeConstructor("placeholder", 1);
    _consannotated_2 = termFactory.makeConstructor("annotated", 2);
    _consempty_grammar_0 = termFactory.makeConstructor("empty-grammar", 0);
    _consconc_grammars_2 = termFactory.makeConstructor("conc-grammars", 2);
    _conssyntax_1 = termFactory.makeConstructor("syntax", 1);
    _conslexical_syntax_1 = termFactory.makeConstructor("lexical-syntax", 1);
    _conscontext_free_syntax_1 = termFactory.makeConstructor("context-free-syntax", 1);
    _consvariables_1 = termFactory.makeConstructor("variables", 1);
    _conslexical_variables_1 = termFactory.makeConstructor("lexical-variables", 1);
    _consimp_section_1 = termFactory.makeConstructor("imp-section", 1);
    _conspriorities_1 = termFactory.makeConstructor("priorities", 1);
    _conskernel_start_symbols_1 = termFactory.makeConstructor("kernel-start-symbols", 1);
    _conslexical_start_symbols_1 = termFactory.makeConstructor("lexical-start-symbols", 1);
    _conscontext_free_start_symbols_1 = termFactory.makeConstructor("context-free-start-symbols", 1);
    _consrestrictions_1 = termFactory.makeConstructor("restrictions", 1);
    _consaliases_1 = termFactory.makeConstructor("aliases", 1);
    _conslexical_priorities_1 = termFactory.makeConstructor("lexical-priorities", 1);
    _conscontext_free_priorities_1 = termFactory.makeConstructor("context-free-priorities", 1);
    _conslexical_restrictions_1 = termFactory.makeConstructor("lexical-restrictions", 1);
    _conscontext_free_restrictions_1 = termFactory.makeConstructor("context-free-restrictions", 1);
    _consterm_1 = termFactory.makeConstructor("term", 1);
    _consbracket_0 = termFactory.makeConstructor("bracket", 0);
    _consassoc_1 = termFactory.makeConstructor("assoc", 1);
    _consreject_0 = termFactory.makeConstructor("reject", 0);
    _consprefer_0 = termFactory.makeConstructor("prefer", 0);
    _consavoid_0 = termFactory.makeConstructor("avoid", 0);
    _consattrs_1 = termFactory.makeConstructor("attrs", 1);
    _consno_attrs_0 = termFactory.makeConstructor("no-attrs", 0);
    _consprod_3 = termFactory.makeConstructor("prod", 3);
    _consprefix_fun_4 = termFactory.makeConstructor("prefix-fun", 4);
    _conscf_1 = termFactory.makeConstructor("cf", 1);
    _conslex_1 = termFactory.makeConstructor("lex", 1);
    _consvarsym_1 = termFactory.makeConstructor("varsym", 1);
    _conslayout_0 = termFactory.makeConstructor("layout", 0);
    _consempty_0 = termFactory.makeConstructor("empty", 0);
    _consopt_1 = termFactory.makeConstructor("opt", 1);
    _consiter_1 = termFactory.makeConstructor("iter", 1);
    _consiter_star_1 = termFactory.makeConstructor("iter-star", 1);
    _consiter_sep_2 = termFactory.makeConstructor("iter-sep", 2);
    _consiter_star_sep_2 = termFactory.makeConstructor("iter-star-sep", 2);
    _constuple_2 = termFactory.makeConstructor("tuple", 2);
    _consfunc_2 = termFactory.makeConstructor("func", 2);
    _consstrategy_2 = termFactory.makeConstructor("strategy", 2);
    _conslifting_1 = termFactory.makeConstructor("lifting", 1);
    _conssort_1 = termFactory.makeConstructor("sort", 1);
    _consparameterized_sort_2 = termFactory.makeConstructor("parameterized-sort", 2);
    _conslit_1 = termFactory.makeConstructor("lit", 1);
    _consci_lit_1 = termFactory.makeConstructor("ci-lit", 1);
    _conslabel_2 = termFactory.makeConstructor("label", 2);
    _consstart_0 = termFactory.makeConstructor("start", 0);
    _consfile_start_0 = termFactory.makeConstructor("file-start", 0);
    _consrenamings_1 = termFactory.makeConstructor("renamings", 1);
    _conssymbol_2 = termFactory.makeConstructor("symbol", 2);
    _consproduction_2 = termFactory.makeConstructor("production", 2);
    _consexports_1 = termFactory.makeConstructor("exports", 1);
    _conshiddens_1 = termFactory.makeConstructor("hiddens", 1);
    _consunparameterized_1 = termFactory.makeConstructor("unparameterized", 1);
    _consparameterized_2 = termFactory.makeConstructor("parameterized", 2);
    _consimports_1 = termFactory.makeConstructor("imports", 1);
    _consrenamed_module_2 = termFactory.makeConstructor("renamed-module", 2);
    _consleft_0 = termFactory.makeConstructor("left", 0);
    _consright_0 = termFactory.makeConstructor("right", 0);
    _consnon_assoc_0 = termFactory.makeConstructor("non-assoc", 0);
    _consassoc_0 = termFactory.makeConstructor("assoc", 0);
    _consdefault_1 = termFactory.makeConstructor("default", 1);
    _conswith_arguments_2 = termFactory.makeConstructor("with-arguments", 2);
    _consnon_transitive_1 = termFactory.makeConstructor("non-transitive", 1);
    _conssimple_group_1 = termFactory.makeConstructor("simple-group", 1);
    _consprods_group_1 = termFactory.makeConstructor("prods-group", 1);
    _consassoc_group_2 = termFactory.makeConstructor("assoc-group", 2);
    _conschain_1 = termFactory.makeConstructor("chain", 1);
    _consassoc_3 = termFactory.makeConstructor("assoc", 3);
    _consnumeric_1 = termFactory.makeConstructor("numeric", 1);
    _consshort_1 = termFactory.makeConstructor("short", 1);
    _constop_0 = termFactory.makeConstructor("top", 0);
    _conseof_0 = termFactory.makeConstructor("eof", 0);
    _consbot_0 = termFactory.makeConstructor("bot", 0);
    _conslabel_start_0 = termFactory.makeConstructor("label_start", 0);
    _consrange_2 = termFactory.makeConstructor("range", 2);
    _consconc_2 = termFactory.makeConstructor("conc", 2);
    _consabsent_0 = termFactory.makeConstructor("absent", 0);
    _conspresent_1 = termFactory.makeConstructor("present", 1);
    _conssimple_charclass_1 = termFactory.makeConstructor("simple-charclass", 1);
    _conscomp_1 = termFactory.makeConstructor("comp", 1);
    _consdiff_2 = termFactory.makeConstructor("diff", 2);
    _consisect_2 = termFactory.makeConstructor("isect", 2);
    _consunion_2 = termFactory.makeConstructor("union", 2);
    _consunquoted_fun_1 = termFactory.makeConstructor("unquoted-fun", 1);
    _consquoted_fun_1 = termFactory.makeConstructor("quoted-fun", 1);
    _consquoted_1 = termFactory.makeConstructor("quoted", 1);
    _consunquoted_1 = termFactory.makeConstructor("unquoted", 1);
    _conschar_class_1 = termFactory.makeConstructor("char-class", 1);
    _consseq_2 = termFactory.makeConstructor("seq", 2);
    _conssingle_1 = termFactory.makeConstructor("single", 1);
    _consalt_2 = termFactory.makeConstructor("alt", 2);
    _conslist_1 = termFactory.makeConstructor("list", 1);
    _consfollow_2 = termFactory.makeConstructor("follow", 2);
    _consalias_2 = termFactory.makeConstructor("alias", 2);
    _consdefinition_1 = termFactory.makeConstructor("definition", 1);
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
    _consAnalyses_1 = termFactory.makeConstructor("Analyses", 1);
    _consPureDesugaring_1 = termFactory.makeConstructor("PureDesugaring", 1);
    _consInjectDesugaring_4 = termFactory.makeConstructor("InjectDesugaring", 4);
    _consDesugarings_1 = termFactory.makeConstructor("Desugarings", 1);
    _conseditor_elem_1 = termFactory.makeConstructor("editor-elem", 1);
    _consgrammar_elem_1 = termFactory.makeConstructor("grammar-elem", 1);
    _constransformation_elem_1 = termFactory.makeConstructor("transformation-elem", 1);
    _consTransformationDef_2 = termFactory.makeConstructor("TransformationDef", 2);
    _consTransApp_2 = termFactory.makeConstructor("TransApp", 2);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    constNil0 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    constempty_grammar0 = termFactory.makeAppl(ext_out._consempty_grammar_0, NO_TERMS);
    const0 = termFactory.makeString("desugar");
    const1 = termFactory.makeString("changed-tree");
    constSVar0 = termFactory.makeAppl(ext_out._consSVar_1, new IStrategoTerm[]{extraction.const1});
    constCallNoArgs0 = termFactory.makeAppl(ext_out._consCallNoArgs_1, new IStrategoTerm[]{extraction.constSVar0});
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}