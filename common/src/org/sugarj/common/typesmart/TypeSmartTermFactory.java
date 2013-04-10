package org.sugarj.common.typesmart;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.stratego.CallT;
import org.spoofax.interpreter.stratego.SDefT;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoConstructor;
import org.spoofax.interpreter.terms.IStrategoInt;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoPlaceholder;
import org.spoofax.interpreter.terms.IStrategoReal;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.IStrategoTuple;
import org.spoofax.interpreter.terms.ITermFactory;
import org.spoofax.terms.AbstractTermFactory;
import org.spoofax.terms.Term;
import org.strategoxt.lang.StrategoException;

/**
 * When constructing an application term, this term factory
 * looks for the existing of a type-smart constructor. If such
 * constructor exists, it is used for the construction of the term.
 * Otherwise, a standard build is performed using the base factory.
 * 
 * @author seba
 */
public class TypeSmartTermFactory extends AbstractTermFactory {
  
  private IContext context;
  private ITermFactory baseFactory;
  
  public static TypeSmartTermFactory registerNewTypeSmartTermFactory(IContext context) {
    TypeSmartTermFactory factory = new TypeSmartTermFactory(context.getFactory(), context);
    context.setFactory(factory);
    return factory;
  }
  
  public TypeSmartTermFactory(ITermFactory baseFactory, IContext context) {
    super(baseFactory.getDefaultStorageType());
    this.baseFactory = baseFactory;
    this.context = context;
  }
    
  @Override
  public IStrategoAppl makeAppl(IStrategoConstructor ctr, IStrategoTerm[] terms, IStrategoList annotations) {
    
    String smartCtrName = "smart-" + ctr.getName();
    smartCtrName = smartCtrName.replace("-", "_") + "_0_" + terms.length;

    try {
      SDefT sdef = context.lookupSVar(smartCtrName);

      // no check defined
      if (sdef == null)
        return baseFactory.makeAppl(ctr, terms, annotations);
      
      // apply smart constructor to argument terms
      CallT smartCall = new CallT(smartCtrName, new Strategy[0], new IStrategoTerm[0]);
      IStrategoTerm currentWas = context.current();
      IStrategoTerm t;
      try {
        boolean smartOk = smartCall.evaluateWithArgs(context, new Strategy[0], terms);
      
        if (!smartOk)
          throw new StrategoException("Smart constructor failed for: " + baseFactory.makeAppl(ctr, terms, annotations));

        t = context.current();
      } finally {
        context.setCurrent(currentWas);
      }
      
      if (!(t instanceof IStrategoAppl))
        throw new StrategoException("Smart constructor should have returned an application term, but was: " + t);
      
      IStrategoAppl appl = (IStrategoAppl) t;
      if (!appl.getConstructor().equals(ctr))
        throw new StrategoException("Smart constructor should have returned an application term with constructor " + ctr + ", but was: " + t);

      return appl;
    } catch (InterpreterException e) {
      throw new StrategoException("Type-unsafe constructor application " + ctr, e);
    }
  }

  @Override
  public ITermFactory getFactoryWithStorageType(int arg0) {
    return baseFactory.getFactoryWithStorageType(arg0);
  }

  @Override
  public IStrategoTerm annotateTerm(IStrategoTerm t, IStrategoList annos) {
    if (annos.isEmpty()) {
      IStrategoList actualAnnos = t.getAnnotations();
      while (actualAnnos != null && !actualAnnos.isEmpty()) {
        if (Term.isTermTuple(actualAnnos.head()) && 
            actualAnnos.head().getSubtermCount() == 2 &&
            Term.isTermString(actualAnnos.head().getSubterm(0)) &&
            Term.asJavaString(actualAnnos.head().getSubterm(0)).equals("analysis-data"))
          return t;
        actualAnnos = actualAnnos.tail();
      }
    }
    
    return baseFactory.annotateTerm(t, annos);
  }

  @Override
  public IStrategoInt makeInt(int arg0) {
    return baseFactory.makeInt(arg0);
  }

  @Override
  public IStrategoPlaceholder makePlaceholder(IStrategoTerm arg0) {
    return baseFactory.makePlaceholder(arg0);
  }

  @Override
  public IStrategoReal makeReal(double arg0) {
    return baseFactory.makeReal(arg0);
  }

  @Override
  public IStrategoString makeString(String arg0) {
    return baseFactory.makeString(arg0);
  }

  @Override
  public IStrategoString tryMakeUniqueString(String arg0) {
    return baseFactory.makeString(arg0);
  }

  @Override
  public IStrategoList makeList(IStrategoTerm[] arg0, IStrategoList arg1) {
    return baseFactory.makeList(arg0, arg1);
  }

  @Override
  public IStrategoList makeListCons(IStrategoTerm arg0, IStrategoList arg1, IStrategoList arg2) {
    return baseFactory.makeListCons(arg0, arg1, arg2);
  }

  @Override
  public IStrategoTuple makeTuple(IStrategoTerm[] arg0, IStrategoList arg1) {
    return baseFactory.makeTuple(arg0, arg1);
  }

  public ITermFactory getBaseFactory() {
    return baseFactory;
  }
}
