# Generated Python (pseudo-code)
    # from flask import ...
    # import json
    # import os
    # from werkzeug.utils import ...
    t0 = <expr>
    t1 = Flask(t0)
    app = t1
    t2 = 10
    x = t2
    t3 = ""static/uploads""
    UPLOAD_FOLDER = t3
    t4 = ""products.json""
    PRODUCT_FILE = t4
    t5 = UPLOAD_FOLDER
    t6 = 5
    t7 = 1024
    t8 = t6 * t7
    t9 = 1024
    t10 = t8 * t9
    t11 = <expr>
    ALLOWED_EXTENSIONS = t11

def allowed_file():
func_allowed_file:
    t12 = <expr>
    return t12
    # end allowed_file

def load_products():
func_load_products:
    t13 = <expr>
    if not t13: goto t14_else
    t16 = <expr>
    return t16
    goto t15_endif
t14_else:
t15_endif:
    # end load_products

def save_products():
func_save_products:
    # end save_products
    t17 = load_products()
    products = t17

def index():
func_index:
    t18 = <expr>
    t19 = <expr>
    t20 = render_template(t18, t19)
    return t20
    # end index

def product_details():
func_product_details:
    t21 = <expr>
    t22 = <expr>
    t23 = next(t21, t22)
    product = t23
    t24 = <expr>
    t25 = <expr>
    t26 = render_template(t24, t25)
    return t26
    # end product_details

def add_product():
func_add_product:
    t27 = request
    t28 = t27.method
    t29 = ""POST""
    t30 = t28 == t29
    if not t30: goto t31_else
    t33 = <expr>
    name = t33
    t34 = <expr>
    t35 = float(t34)
    price = t35
    t36 = <expr>
    details = t36
    goto t32_endif
t31_else:
t32_endif:
    t37 = <expr>
    file = t37
    t38 = <expr>
    if not t38: goto t39_else
    t41 = <expr>
    t42 = secure_filename(t41)
    filename = t42
    t43 = <expr>
    t44 = <expr>
    t45 = <?>(t43, t44)
    filepath = t45
    t46 = <expr>
    t47 = <?>(t46)
    goto t40_endif
t39_else:
    t48 = ""no_image.png""
    filename = t48
t40_endif:
    t49 = <expr>
    t50 = <expr>
    t51 = max(t49, t50)
    t52 = 1
    t53 = t51 + t52
    new_id = t53
    t54 = <expr>
    new_product = t54
    t55 = <expr>
    t56 = <?>(t55)
    t57 = <expr>
    t58 = save_products(t57)
    t59 = <expr>
    t60 = redirect(t59)
    return t60
    t61 = <expr>
    t62 = render_template(t61)
    return t62
    t63 = __name__
    t64 = ""__main__""
    t65 = t63 == t64
    if not t65: goto t66_else
    t68 = <expr>
    if not t68: goto t69_else
    t71 = <expr>
    t72 = <?>(t71)
    t73 = <expr>
    t74 = <?>(t73)
    goto t70_endif
t69_else:
t70_endif:
    goto t67_endif
t66_else:
t67_endif:
    # end add_product
