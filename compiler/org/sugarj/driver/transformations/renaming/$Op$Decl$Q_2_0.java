package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Op$Decl$Q_2_0 extends Strategy 
{ 
  public static $Op$Decl$Q_2_0 instance = new $Op$Decl$Q_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_47, Strategy t_47)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDeclQ_2_0");
    Fail353:
    { 
      IStrategoTerm z_194 = null;
      IStrategoTerm x_194 = null;
      IStrategoTerm y_194 = null;
      IStrategoTerm a_195 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOpDeclQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail353;
      x_194 = term.getSubterm(0);
      y_194 = term.getSubterm(1);
      IStrategoList annos297 = term.getAnnotations();
      z_194 = annos297;
      term = s_47.invoke(context, x_194);
      if(term == null)
        break Fail353;
      a_195 = term;
      term = t_47.invoke(context, y_194);
      if(term == null)
        break Fail353;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOpDeclQ_2, new IStrategoTerm[]{a_195, term}), checkListAnnos(termFactory, z_194));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}