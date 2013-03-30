#lang racket

(require redex)
(require rackunit)

;;;;;;;;;;;;;;;;;;;;;;
;; syntax
;;;;;;;;;;;;;;;;;;;;;;
(define-language soundext
  (t x (string t ...) (symbol x)) ;; terms
  (x (variable-except ⊢ : => -> ∅))  ;;  variables
  
  (rewrite (t -> t))  ;; rewrite rules
  (judge (t ⊢ t : t))  ;; type judgements
  (trule (judge ... => judge))  ;; type rules
  (ext (rewrite ... trule ...))  ;; language extension
  (base (trule ...))  ;; base system
  
  (σ ((x t) ...))  ;; substitutions
  (maybe-σ σ #f)  ;; auxiliary
  )

;;;;;;;;;;;;;;;;;;;;;;
;; substitution
;;;;;;;;;;;;;;;;;;;;;;
(define-metafunction soundext
  concat-substs : maybe-σ ... -> σ or #f
  [(concat-substs) ()]
  [(concat-substs σ) σ]
  [(concat-substs ((x_0 t_0) ...) σ_1 σ_2 ...)
   (concat-substs σ_0_1 σ_2 ...)
   (where #t (compatible-substs ((x_0 t_0) ...) σ_1))
   (where ((x_1 t_1) ...) σ_1)
   (where σ_0_1 ((x_0 t_0) ... (x_1 t_1) ...))]
  [(concat-substs maybe-σ ...)
   #f])

(define-metafunction soundext
  compose-substs : σ ... -> σ or #f
  [(compose-substs) ()]
  [(compose-substs σ) σ]
  [(compose-substs ((x_0 t_0) ...) σ_1 σ_2 ...)
   (compose-substs σ_0_1 σ_2 ...)
   (where #t (compatible-substs ((x_0 t_0) ...) σ_1))
   (where ((x_1 t_1) ...) σ_1)
   (where σ_0_1 ((x_0 (apply-subst σ_1 t_0)) ... (x_1 t_1) ...))]
  [(compose-substs σ ...)
   #f])

(define-metafunction soundext
  compatible-substs : σ σ -> #t or #f
  [(compatible-substs () σ)
   #t]
  [(compatible-substs ((x_0 t_0) (x_1 t_1) ...) σ)
   (compatible-substs ((x_1 t_1) ...) σ)
   (where x_0 (apply-subst σ x_0))]
  [(compatible-substs ((x_0 t_0) (x_1 t_1) ...) σ)
   (compatible-substs ((x_1 t_1) ...) σ)
   (where t_0 (apply-subst σ x_0))]
  [(compatible-substs σ_1 σ_2)
   #f])

(define-metafunction soundext
  match : t t -> σ or #f
  [(match x t)
   ((x t))]
  [(match (symbol x) (symbol x))
   ()]
  [(match (string t_1 ...) (string t_2 ...))
   (concat-substs (match t_1 t_2) ...)]
  [(match t_1 t_2) #f])

(define-metafunction soundext
  match-non-cyclic : t t -> σ or #f
  [(match-non-cyclic x x)
   ((x x))]
  [(match-non-cyclic (symbol x) (symbol x))
   ()]
  [(match-non-cyclic x t)
   ((x t))
   (where #f (elem x (free-vars t)))]
  [(match-non-cyclic (string t_1 ...) (string t_2 ...))
   (concat-substs (match-non-cyclic t_1 t_2) ...)]
  [(match-non-cyclic t_1 t_2) #f])

(define-metafunction soundext
  nub-subst : σ -> σ
  [(nub-subst ()) ()]
  [(nub-subst ((x_0 x_0) (x_1 t_1) ...))
   (nub-subst ((x_1 t_1) ...))]
  [(nub-subst ((x_0 t_0) (x_1 t_1) ...))
   ((x_0 t_0) (x_r t_r) ...)
   (where ((x_r t_r) ...) (nub-subst ((x_1 t_1) ...)))])

(define-metafunction soundext
  apply-subst : σ t -> t or #f
  [(apply-subst () t) t]
  [(apply-subst σ (symbol x)) (symbol x)]
  [(apply-subst ((x_0 t_0) (x t) ...) x_0) t_0]
  [(apply-subst ((x_0 t_0) (x t) ...) x_1) (apply-subst ((x t) ...) x_1)]
  [(apply-subst σ (string t ...)) (string (apply-subst σ t) ...)])

(define-metafunction soundext
  free-vars : t -> (x ...)
  [(free-vars x) (x)]
  [(free-vars (symbol x)) ()]
  [(free-vars (string t ...)) 
   (x ... ...)
   (where ((x ...) ...) ((free-vars t) ...))])

(define-metafunction soundext
  elem : any (any ...) -> boolean
  [(elem any ()) #f]
  [(elem any (any any_1 ...)) #t]
  [(elem any (any_0 any_1 ...))
   (elem any (any_1 ...))])

(define-metafunction soundext
  restrict-subst : σ (x ...) -> σ
  [(restrict-subst () (x ...)) ()]
  [(restrict-subst ((x_0 t_0) (x_1 t_1) ...) (x ...))
   ((x_0 t_0) (x_r t_r) ...)
   (where #t (elem x_0 (x ...)))
   (where ((x_r t_r) ...) (restrict-subst ((x_1 t_1) ...) (x ...)))]
  [(restrict-subst ((x_0 t_0) (x_1 t_1) ...) (x ...))
   (restrict-subst ((x_1 t_1) ...) (x ...))])

;;;;;;;;;;;;;;;;;;;;;;
;; type checking
;;;;;;;;;;;;;;;;;;;;;;
(define-metafunction soundext
  match-judge : judge judge -> σ or #f
  [(match-judge (t_ctx ⊢ t_exp : t_type) (t_ctx_goal ⊢ t_exp_goal : t_type_goal))
   σ_all
   ;; debug code
   (side-condition (printf "ctx: ~a == ~a~n" (term t_ctx) (term t_ctx_goal)))
   (where σ_ctx (match t_ctx t_ctx_goal))
   ;; debug code
   (side-condition (printf "ctx: ~a~n" (term σ_ctx)))
   ;; debug code
   (side-condition (printf "exp: ~a == ~a~n" (term t_exp) (term t_exp_goal)))
   (where σ_exp (match t_exp t_exp_goal))
   ;; debug code
   (side-condition (printf "exp: ~a~n" (term σ_exp)))
   ;; debug code
   (side-condition (printf "typ: ~a == ~a~n" (term t_type) (term t_type_goal)))
   ;(where σ_type (match t_type t_type_goal))
   ;; debug code
   ;(side-condition (printf "typ: ~a~n" (term σ_type)))
   (where σ_all (concat-substs σ_ctx σ_exp))]
  [(match-judge judge_0 judge) #f])

(define-metafunction soundext
  instantiate-premise : σ judge -> judge
  [(instantiate-premise σ (t_ctx ⊢ t_exp : t_type))
   ((apply-subst σ t_ctx) ⊢ (apply-subst σ t_exp) : (apply-subst σ t_type))])

(define-metafunction soundext
  instantiate-type : σ (σ ...) judge judge -> (t σ) or #f
  [(instantiate-type σ (σ_t ...) (t_ctx ⊢ t_exp : t_type) (t_ctx_goal ⊢ t_exp_goal : t_type_goal))
   (t_derived σ_r)
   ; debug code
   (side-condition (printf "inst-type: ~a = ~a && ~a~n" (term t_type) (term (σ_t ...)) (term σ)))
   (where σ_all (compose-substs σ σ_t ...))
   (where t_derived (apply-subst σ_all t_type))
   (side-condition (printf "inst-type: ~a => ~a~n" (term t_type_goal) (term t_derived)))
   (where σ_r (match-non-cyclic t_type_goal t_derived))
   (side-condition (printf "inst-type: σ = ~a~n" (term σ_r)))]
  [(instantiate-type σ (σ_t ...) judge judge_goal) #f])

(define-metafunction soundext
  typeof-premises : (trule ...) σ (judge ...) -> ((t σ) ...) or #f
  [(typeof-premises (trule_all ...) σ ()) ()]
  [(typeof-premises (trule_all ...) σ (judge_0 judge_1 ...))
   ((t_0 σ_0) (t_1 σ_1) ...)
   (where judge_inst (instantiate-premise σ judge_0))
   (side-condition (printf "typeof-premise: ~a~n" (term judge_inst)))
   (where (t_0 σ_0) (typeof (trule_all ...) judge_inst))
   (side-condition (printf "typeof-premise: => ~a~n" (term (t_0 σ_0))))
   (where σ_composed (compose-substs σ σ_0))
   (where ((t_1 σ_1) ...) (typeof-premises (trule_all ...) σ_composed (judge_1 ...)))]
  [(typeof-premises (trule_all ...) σ (judge_0 judge_1 ...)) 
   #f
   (side-condition (printf "typeof-preimse failed: ~a~n" (term (instantiate-premise σ judge_0))))])


(define-metafunction soundext
  typeof-it : (trule ...) (trule ...) judge -> (t σ) or #f
  [(typeof-it (trule_all ...) () judge) #f]
  [(typeof-it (trule_all ...) ((judge_prem ... => judge_conc) trule ...) judge)
   (instantiate-type σ (σ_t ...) judge_conc judge)
   (where σ (match-judge judge_conc judge))
   (where ((t σ_t) ...) (typeof-premises (trule_all ...) σ (judge_prem ...)))]
  [(typeof-it (trule_all ...) (trule_0 trule ...) judge)
   (typeof-it (trule_all ...) (trule ...) judge)])

(define-metafunction soundext
  typeof : (trule ...) judge -> (t σ) or #f
  [(typeof (trule ...) judge)
   (typeof-it (trule ...) (trule ...) judge)])

(define-metafunction soundext
  tcheck : (trule ...) judge -> #t or #f or t
  [(tcheck (trule ...) (t_ctx ⊢ t_exp : t_type)) #t
   (where (t_type σ) (typeof (trule ...) (t_ctx ⊢ t_exp : t_type)))
   (side-condition (printf "tcheck: ~a => ~a~n" (term t) (term t_type)))]
  [(tcheck (trule ...) (t_ctx ⊢ t_exp : t_type)) t
   (where (t σ) (typeof (trule ...) (t_ctx ⊢ t_exp : t_type)))
   (side-condition (printf "tcheck: failed~n"))]
  [(tcheck (trule ...) judge) 
   #f
   (side-condition (printf "tcheck: failed~n"))])


;;;;;;;;;;;;;;;;;;;;;;
;; term rewriting
;;;;;;;;;;;;;;;;;;;;;;
(define-metafunction soundext
  rewrite-term : rewrite ... t -> t or #f
  [(rewrite-term t) #f]
  [(rewrite-term (t_1 -> t_2) rewrite ... t)
   (apply-subst σ t_2)
   (where σ (match t_1 t))]
  [(rewrite-term (t_1 -> t_2) rewrite ... t)
   (rewrite-term rewrite ... t2)])

;;;;;;;;;;;;;;;;;;;;;;
;; extension checking
;;;;;;;;;;;;;;;;;;;;;;
(define-metafunction soundext
  symbolic-judge : judge -> judge
  [(symbolic-judge (t_ctx ⊢ t_exp : t_type))
   ((symbolic t_ctx) ⊢ (symbolic t_exp) : (symbolic t_type))])

(define-metafunction soundext
  symbolic : t -> t
  [(symbolic x) (symbol x)]
  [(symbolic (symbol x)) (symbol x)]
  [(symbolic (string t ...))
   (string (symbolic t) ...)])

(define-relation soundext
  check-rule ⊂ base x (rewrite ...) x trule
  [(check-rule (trule ...) (rewrite ...) (judge ... => (t_ctx ⊢ t_exp : t_type)))
   (where t_exp2 (rewrite-term rewrite ... t_exp))
   (side-condition (printf "derived rule: ~a~n" (term (judge ... => (t_ctx ⊢ t_exp2 : t_type)))))
   (where judge_goal (symbolic-judge (t_ctx ⊢ t_exp2 : t_type)))
   (where (trule_premise_axiom ...) ((=> (symbolic-judge judge)) ...))
   (where #t (tcheck (trule ... trule_premise_axiom ...) judge_goal))
   ])

(define-relation soundext
  check-ext ⊂ base x ext
  [(check-ext base (rewrite ...))]
  [(check-ext base (rewrite ... trule_0 trule ...))
   (check-rule base (rewrite ...) trule_0)
   (check-ext base (rewrite ... trule ...))])


;;;;;;;;;;;;;;;;;;;;;;
;; test type checker
;;;;;;;;;;;;;;;;;;;;;;

(define (test-wrong-type test-desc expr1 expr2)
  (test-equal? test-desc expr2 expr1))

(define T-Var
  (term
   (
    =>
    (("Γbind" Γ x t) ⊢ x : t))))

(define T-Weak
  (term
   ((Γ ⊢ x : t)
    =>
    (("Γbind" Γ x2 t2) ⊢ x : t))))

(define T-Abs
  (term 
   ((("Γbind" Γ x t1) ⊢ e : t2)
    =>
    (Γ ⊢ ("abs" x t1 e) : ("Fun" t1 t2)))))

(define T-App
  (term 
   ((Γ ⊢ e1 : ("Fun" t1 t2))
    (Γ ⊢ e2 : t1)
    =>
    (Γ ⊢ ("app" e1 e2) : t2))))

(test-not-false "T-Abs is type rule" (redex-match soundext trule T-Abs))
(test-not-false "T-App is type rule" (redex-match soundext trule T-App))

(define var-judge
  (term (("Γbind" ("Empty") x t) ⊢ x : t)))
(test-true "Type check var judgement" (term (tcheck (,T-Var ,T-Weak ,T-Abs ,T-App) ,var-judge)))
(define var-judge-fail
  (term (("Γbind" ("Empty") y t1) ⊢ y : t2)))
(test-wrong-type "Type check false var judgement" (term t1) (term (tcheck (,T-Var ,T-Weak ,T-Abs ,T-App) ,var-judge-fail)))
(define var-weak-judge
  (term (("Γbind" ("Γbind" ("Empty") y t2) x t1) ⊢ y : t2)))
(test-true "Type check var judgement" (term (tcheck (,T-Var ,T-Weak ,T-Abs ,T-App) ,var-weak-judge)))

(define id
  (term ("abs" x a x)))
(define id-judge
  (term (("Empty") ⊢ ,id : ("Fun" a a))))
(test-true "Type check id judgement" (term (tcheck (,T-Var ,T-Weak ,T-Abs ,T-App) ,id-judge)))
(define id-judge-fail
  (term (("Empty") ⊢ ,id : ("Fun" a b))))
(test-wrong-type "Type check false id judgement" (term ("Fun" a a)) (term (tcheck (,T-Var ,T-Weak ,T-Abs ,T-App) ,id-judge-fail)))

(define f-judge
  (term (("Γbind" ("Γbind" ("Empty") x a) f ("Fun" a b)) ⊢ f : ("Fun" a b))))
(test-true "Type check (f x) judgement" (term (tcheck (,T-Var ,T-Weak ,T-Abs ,T-App) ,f-judge)))
(define f-app-judge
  (term (("Γbind" ("Γbind" ("Empty") y a) f ("Fun" a b)) ⊢ ("app" f y) : b)))
(test-true "Type check (f x) judgement" (term (tcheck (,T-Weak ,T-Abs ,T-App ,T-Var) ,f-app-judge)))
(define id-app-judge
  (term (("Γbind" ("Empty") y a) ⊢ ("app" ,id y) : a)))
(test-true "Type check (f x) judgement" (term (tcheck (,T-Weak ,T-Abs ,T-App ,T-Var) ,id-app-judge)))
(define id-app-judge-fail
  (term (("Γbind" ("Empty") y a) ⊢ ("app" ,id y) : b)))
(test-wrong-type "Type check (f x) judgement" (term a) (term (tcheck (,T-Weak ,T-Abs ,T-App ,T-Var) ,id-app-judge-fail)))
(define id-id-app-judge-fail
  (term (("Γbind" ("Empty") y a) ⊢ ("app" ,id ,id) : ("Fun" a a))))
;; fails because the type variable is not quantified but globally scoped
(test-false "Type check (f x) judgement" (term (tcheck (,T-Weak ,T-Abs ,T-App ,T-Var) ,id-id-app-judge-fail)))
(define id-id-app-judge
  (term (("Γbind" ("Empty") y a) ⊢ ("app" ,id ("abs" x b x)) : ("Fun" b b))))
;; succeeds because of distinct type variables in the first and second id function
(test-true "Type check (f x) judgement" (term (tcheck (,T-Weak ,T-Abs ,T-App ,T-Var) ,id-id-app-judge)))

(define beta-judge
  (term (("Γbind" ("Γbind" ("Empty") e1 t1) e2 t2) ⊢ ("app" ("abs" x t1 e2) e1) : t2)))
(test-true "Type check beta judgement" (term (tcheck (,T-Weak ,T-Abs ,T-App ,T-Var) ,beta-judge)))
(define beta-judge-fail
  (term (("Γbind" ("Γbind" ("Empty") e1 t1) e2 t2) ⊢ ("app" ("abs" x t1 e2) e1) : t1)))
(test-wrong-type "Type check beta judgement" (term t2) (term (tcheck (,T-Weak ,T-Abs ,T-App ,T-Var) ,beta-judge-fail)))

;;;;;;;;;;;;;;;;;;;;;;
;; test extension checker
;;;;;;;;;;;;;;;;;;;;;;

(define let-base
  (term (,T-Weak ,T-Abs ,T-App ,T-Var)))

(define let-rewrite
  (term (("let" x t e1 e2) -> ("app" ("abs" x t e2) e1))))
(define T-Let
  (term 
   ((Γ ⊢ e1 : t1)
    (("Γbind" Γ x t1) ⊢ e2 : t2)
    =>
    (Γ ⊢ ("let" x t1 e1 e2) : t2))))
(define let-ext
  (term (,let-rewrite ,T-Let)))
(test-true "let extension is sound" (term (check-ext ,let-base ,let-ext)))


(define let-rewrite-fail
  (term (("let" x t e1 e2) -> ("app" ("abs" x t e2) e2))))
(define let-ext-fail-rewrite
  (term (,let-rewrite-fail ,T-Let)))
(test-false "let-fail-rewrite extension is not sound" (term (check-ext ,let-base ,let-ext-fail-rewrite)))

(define T-Let-fail
  (term 
   ((Γ ⊢ e1 : t1)
    (("Γbind" Γ x t3) ⊢ e2 : t2)
    =>
    (Γ ⊢ ("let" x t1 e1 e2) : t2))))
(define let-ext-fail-trule
  (term (,let-rewrite ,T-Let-fail)))
(test-false "let-ext-fail-trule extension is not sound" (term (check-ext ,let-base ,let-ext-fail-trule)))

;; more restrictive when applied, but also sound
(define T-Let-no-bind
  (term 
   ((Γ ⊢ e1 : t1)
    (Γ ⊢ e2 : t2)
    =>
    (Γ ⊢ ("let" x t1 e1 e2) : t2))))
(define let-ext-no-bind
  (term (,let-rewrite ,T-Let-no-bind)))
(test-true "let-ext-no-bind extension is sound (but not useful)" (term (check-ext ,let-base ,let-ext-no-bind)))

;; more restrictive when applied, but also sound
(define T-Let-same-type
  (term 
   ((Γ ⊢ e1 : t)
    (("Γbind" Γ x t) ⊢ e2 : t)
    =>
    (Γ ⊢ ("let" x t e1 e2) : t))))
(define let-ext-same-type
  (term (,let-rewrite ,T-Let-same-type)))
(test-true "let-ext-same-type extension is sound (but unnecessarily restrictive)" (term (check-ext ,let-base ,let-ext-same-type)))
