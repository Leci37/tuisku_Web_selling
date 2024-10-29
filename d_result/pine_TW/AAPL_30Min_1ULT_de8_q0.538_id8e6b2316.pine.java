//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ultimate_MA_MTF_V2
// ID_model: AAPL_30Min_1ULT_8e6b2316 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_30Min_1ULT_8e6b2316", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_30Min_8e6b2316(cr_up2Int, cr_downInt, avg2, avg, ma_downInt, cr_down2Int, cr_upInt, ma_upInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( avg2 <= 331.19 )
		if( avg2 <= 313.871 )
			if( avg <= 301.755 )
				if( avg2 <= 95.123 )
					if( avg2 <= 93.6906 )
						if( avg2 <= 92.5182 )
							if( avg <= 90.1054 )
								ret := 1.000000 // buy
							if( avg > 90.1054 )
								if( avg <= 90.5247 )
									ret := 0.062500
								if( avg > 90.5247 )
									ret := 0.430380
						if( avg2 > 92.5182 )
							if( avg <= 93.9842 )
								if( cr_down2Int <= 0.5 )
									ret := -0.112840
								if( cr_down2Int > 0.5 )
									ret := 0.736842 // buy
							if( avg > 93.9842 )
								if( ma_downInt <= 0.5 )
									ret := -0.583333
								if( ma_downInt > 0.5 )
									ret := -0.200000
					if( avg2 > 93.6906 )
						if( avg <= 95.5042 )
							if( avg2 <= 94.8408 )
								if( avg <= 94.6156 )
									ret := 0.234568
								if( avg > 94.6156 )
									ret := 0.452055
							if( avg2 > 94.8408 )
								if( cr_upInt <= 0.5 )
									ret := 0.638298
								if( cr_upInt > 0.5 )
									ret := -0.142857
						if( avg > 95.5042 )
							if( avg <= 95.8733 )
								if( avg <= 95.5791 )
									ret := -0.666667
								if( avg > 95.5791 )
									ret := -0.296296
							if( avg > 95.8733 )
								ret := 0.318182
				if( avg2 > 95.123 )
					if( cr_upInt <= 0.5 )
						if( avg2 <= 145.844 )
							if( avg <= 136.11 )
								if( avg2 <= 136.032 )
									ret := 0.040703
								if( avg2 > 136.032 )
									ret := 0.402685
							if( avg > 136.11 )
								if( avg <= 141.128 )
									ret := 0.167263
								if( avg > 141.128 )
									ret := 0.085619
						if( avg2 > 145.844 )
							if( avg2 <= 146.098 )
								if( avg <= 148.176 )
									ret := -0.250000
								if( avg > 148.176 )
									ret := -1.000000 // sell
							if( avg2 > 146.098 )
								if( cr_up2Int <= 0.5 )
									ret := 0.034809
								if( cr_up2Int > 0.5 )
									ret := -0.055777
					if( cr_upInt > 0.5 )
						if( avg2 <= 274.476 )
							if( avg <= 122.073 )
								if( ma_downInt <= 0.5 )
									ret := 0.028986
								if( ma_downInt > 0.5 )
									ret := -0.219512
							if( avg > 122.073 )
								if( avg2 <= 271.776 )
									ret := 0.025132
								if( avg2 > 271.776 )
									ret := 0.800000 // buy
						if( avg2 > 274.476 )
							if( avg2 <= 290.351 )
								if( avg <= 279.525 )
									ret := -0.809524 // sell
								if( avg > 279.525 )
									ret := -0.400000
							if( avg2 > 290.351 )
								if( avg <= 297.756 )
									ret := 0.600000
								if( avg > 297.756 )
									ret := -0.200000
			if( avg > 301.755 )
				if( avg2 <= 311.141 )
					if( avg <= 306.822 )
						if( avg2 <= 303.646 )
							if( avg2 <= 299.761 )
								ret := 1.000000 // buy
							if( avg2 > 299.761 )
								if( avg <= 303.75 )
									ret := 0.000000
								if( avg > 303.75 )
									ret := 0.575000
						if( avg2 > 303.646 )
							if( ma_downInt <= 0.5 )
								if( avg2 <= 306.435 )
									ret := 0.909091 // buy
								if( avg2 > 306.435 )
									ret := 0.000000
							if( ma_downInt > 0.5 )
								ret := 0.909091 // buy
					if( avg > 306.822 )
						if( avg <= 308.896 )
							if( ma_downInt <= 0.5 )
								if( avg <= 307.299 )
									ret := 0.000000
								if( avg > 307.299 )
									ret := -0.574468
							if( ma_downInt > 0.5 )
								if( avg2 <= 309.037 )
									ret := 0.722222 // buy
								if( avg2 > 309.037 )
									ret := -0.500000
						if( avg > 308.896 )
							if( avg <= 310.807 )
								if( avg2 <= 310.072 )
									ret := 0.683333
								if( avg2 > 310.072 )
									ret := 1.000000 // buy
							if( avg > 310.807 )
								if( avg2 <= 308.885 )
									ret := -0.500000
								if( avg2 > 308.885 )
									ret := 0.065217
				if( avg2 > 311.141 )
					if( avg <= 306.419 )
						if( avg2 <= 312.374 )
							if( avg2 <= 311.883 )
								ret := -0.500000
							if( avg2 > 311.883 )
								ret := -1.000000 // sell
						if( avg2 > 312.374 )
							ret := -0.500000
					if( avg > 306.419 )
						if( avg <= 315.314 )
							if( avg <= 314.469 )
								if( avg2 <= 313.814 )
									ret := 0.688312
								if( avg2 > 313.814 )
									ret := -0.500000
							if( avg > 314.469 )
								if( avg <= 315.214 )
									ret := 0.846154 // buy
								if( avg > 315.214 )
									ret := 1.000000 // buy
						if( avg > 315.314 )
							if( avg <= 317.062 )
								if( avg <= 315.998 )
									ret := 0.307692
								if( avg > 315.998 )
									ret := -0.200000
							if( avg > 317.062 )
								if( avg <= 318.045 )
									ret := 0.777778 // buy
								if( avg > 318.045 )
									ret := 1.000000 // buy
		if( avg2 > 313.871 )
			if( avg2 <= 314.549 )
				if( ma_downInt <= 0.5 )
					if( avg <= 312.339 )
						ret := -1.000000 // sell
					if( avg > 312.339 )
						if( avg <= 312.587 )
							ret := 0.000000
						if( avg > 312.587 )
							if( avg <= 316.215 )
								if( avg <= 314.387 )
									ret := -0.857143 // sell
								if( avg > 314.387 )
									ret := -0.545455
							if( avg > 316.215 )
								if( avg <= 317.115 )
									ret := -1.000000 // sell
								if( avg > 317.115 )
									ret := -0.500000
				if( ma_downInt > 0.5 )
					if( avg2 <= 314.258 )
						if( avg2 <= 314.019 )
							ret := -0.600000
						if( avg2 > 314.019 )
							ret := -0.333333
					if( avg2 > 314.258 )
						if( avg2 <= 314.462 )
							ret := 0.285714
						if( avg2 > 314.462 )
							ret := -0.500000
			if( avg2 > 314.549 )
				if( ma_upInt <= 0.5 )
					if( avg2 <= 317.783 )
						if( avg2 <= 315.086 )
							if( avg <= 314.75 )
								if( avg <= 309.393 )
									ret := -1.000000 // sell
								if( avg > 309.393 )
									ret := 0.435897
							if( avg > 314.75 )
								if( avg2 <= 314.921 )
									ret := -0.812500 // sell
								if( avg2 > 314.921 )
									ret := -0.307692
						if( avg2 > 315.086 )
							if( avg <= 317.142 )
								if( avg <= 315.385 )
									ret := 0.508772
								if( avg > 315.385 )
									ret := 0.938776 // buy
							if( avg > 317.142 )
								if( avg2 <= 317.025 )
									ret := -1.000000 // sell
								if( avg2 > 317.025 )
									ret := -0.238095
					if( avg2 > 317.783 )
						if( avg2 <= 320.381 )
							if( avg2 <= 319.853 )
								if( avg <= 316.3 )
									ret := -0.812500 // sell
								if( avg > 316.3 )
									ret := -0.115108
							if( avg2 > 319.853 )
								if( avg <= 320.09 )
									ret := -0.974359 // sell
								if( avg > 320.09 )
									ret := 0.000000
						if( avg2 > 320.381 )
							if( avg2 <= 324.382 )
								if( avg2 <= 323.63 )
									ret := 0.036437
								if( avg2 > 323.63 )
									ret := 0.638298
							if( avg2 > 324.382 )
								if( avg <= 324.996 )
									ret := -0.722222 // sell
								if( avg > 324.996 )
									ret := 0.416667
				if( ma_upInt > 0.5 )
					if( avg <= 324.686 )
						if( avg2 <= 315.043 )
							if( avg <= 316.252 )
								if( avg <= 308.596 )
									ret := -0.750000 // sell
								if( avg > 308.596 )
									ret := -1.000000 // sell
							if( avg > 316.252 )
								if( avg <= 316.787 )
									ret := 0.000000
								if( avg > 316.787 )
									ret := -0.625000
						if( avg2 > 315.043 )
							if( avg <= 318.291 )
								if( avg2 <= 316.207 )
									ret := -0.225806
								if( avg2 > 316.207 )
									ret := 0.370000
							if( avg > 318.291 )
								if( avg <= 319.414 )
									ret := -0.500000
								if( avg > 319.414 )
									ret := -0.103030
					if( avg > 324.686 )
						if( avg2 <= 323.539 )
							ret := -0.878049 // sell
						if( avg2 > 323.539 )
							if( avg <= 331.434 )
								if( avg <= 329.972 )
									ret := -0.258065
								if( avg > 329.972 )
									ret := 0.000000
							if( avg > 331.434 )
								if( avg <= 331.915 )
									ret := -1.000000 // sell
								if( avg > 331.915 )
									ret := -0.400000
	if( avg2 > 331.19 )
		if( avg2 <= 341.066 )
			if( avg2 <= 337.853 )
				if( avg <= 333.228 )
					ret := 1.000000 // buy
				if( avg > 333.228 )
					if( avg <= 338.253 )
						if( avg2 <= 332.446 )
							ret := 0.000000
						if( avg2 > 332.446 )
							ret := -0.428571
					if( avg > 338.253 )
						if( avg2 <= 336.105 )
							if( avg2 <= 335.037 )
								ret := 0.833333 // buy
							if( avg2 > 335.037 )
								ret := 0.500000
						if( avg2 > 336.105 )
							ret := 0.142857
			if( avg2 > 337.853 )
				if( avg <= 335.129 )
					ret := 1.000000 // buy
				if( avg > 335.129 )
					if( avg <= 339.175 )
						if( avg <= 337.952 )
							if( avg <= 335.766 )
								ret := 0.857143 // buy
							if( avg > 335.766 )
								if( avg2 <= 338.934 )
									ret := 0.250000
								if( avg2 > 338.934 )
									ret := 0.714286 // buy
						if( avg > 337.952 )
							ret := 0.000000
					if( avg > 339.175 )
						if( avg2 <= 338.881 )
							ret := 1.000000 // buy
						if( avg2 > 338.881 )
							if( ma_upInt <= 0.5 )
								ret := 1.000000 // buy
							if( ma_upInt > 0.5 )
								if( avg2 <= 339.236 )
									ret := 0.250000
								if( avg2 > 339.236 )
									ret := 0.875000 // buy
		if( avg2 > 341.066 )
			if( avg <= 501.574 )
				if( avg <= 465.785 )
					if( avg <= 448.394 )
						if( avg2 <= 391.737 )
							if( cr_upInt <= 0.5 )
								if( avg2 <= 388.269 )
									ret := 0.190726
								if( avg2 > 388.269 )
									ret := -0.509934
							if( cr_upInt > 0.5 )
								if( ma_upInt <= 0.5 )
									ret := -0.206897
								if( ma_upInt > 0.5 )
									ret := 0.153846
						if( avg2 > 391.737 )
							if( avg2 <= 414.845 )
								if( ma_upInt <= 0.5 )
									ret := 0.675676
								if( ma_upInt > 0.5 )
									ret := 0.957746 // buy
							if( avg2 > 414.845 )
								if( avg2 <= 423.542 )
									ret := -0.653846
								if( avg2 > 423.542 )
									ret := 0.535885
					if( avg > 448.394 )
						if( avg <= 457.679 )
							if( ma_upInt <= 0.5 )
								if( avg2 <= 449.279 )
									ret := -0.750000 // sell
								if( avg2 > 449.279 )
									ret := 0.000000
							if( ma_upInt > 0.5 )
								if( avg <= 451.54 )
									ret := -0.407407
								if( avg > 451.54 )
									ret := 0.239130
						if( avg > 457.679 )
							if( avg <= 458.986 )
								if( ma_downInt <= 0.5 )
									ret := 0.550000
								if( ma_downInt > 0.5 )
									ret := 0.750000 // buy
							if( avg > 458.986 )
								if( avg2 <= 459.61 )
									ret := -0.576271
								if( avg2 > 459.61 )
									ret := 0.063492
				if( avg > 465.785 )
					if( avg <= 500.305 )
						if( avg <= 474.067 )
							if( avg <= 468.541 )
								if( ma_upInt <= 0.5 )
									ret := 0.500000
								if( ma_upInt > 0.5 )
									ret := 1.000000 // buy
							if( avg > 468.541 )
								if( avg <= 471.183 )
									ret := -0.250000
								if( avg > 471.183 )
									ret := -0.200000
						if( avg > 474.067 )
							if( avg2 <= 500.814 )
								if( avg2 <= 473.759 )
									ret := 0.795455 // buy
								if( avg2 > 473.759 )
									ret := 0.981132 // buy
							if( avg2 > 500.814 )
								if( avg <= 498.534 )
									ret := 0.000000
								if( avg > 498.534 )
									ret := 0.857143 // buy
					if( avg > 500.305 )
						if( avg2 <= 502.104 )
							ret := 0.000000
						if( avg2 > 502.104 )
							if( avg <= 501.084 )
								ret := 0.600000
							if( avg > 501.084 )
								ret := 0.166667
			if( avg > 501.574 )
				if( ma_upInt <= 0.5 )
					if( avg <= 504.74 )
						if( ma_downInt <= 0.5 )
							if( avg2 <= 502.852 )
								ret := -1.000000 // sell
							if( avg2 > 502.852 )
								ret := -0.500000
						if( ma_downInt > 0.5 )
							if( avg <= 503.101 )
								if( avg2 <= 502.648 )
									ret := -1.000000 // sell
								if( avg2 > 502.648 )
									ret := 0.000000
							if( avg > 503.101 )
								if( avg <= 503.86 )
									ret := -1.000000 // sell
								if( avg > 503.86 )
									ret := -0.812500 // sell
					if( avg > 504.74 )
						if( avg <= 505.669 )
							if( avg2 <= 503.116 )
								ret := 0.750000 // buy
							if( avg2 > 503.116 )
								ret := 0.500000
						if( avg > 505.669 )
							ret := -0.428571
				if( ma_upInt > 0.5 )
					if( avg2 <= 494.651 )
						if( avg <= 505.069 )
							ret := -1.000000 // sell
						if( avg > 505.069 )
							if( avg <= 506.713 )
								ret := -0.500000
							if( avg > 506.713 )
								ret := -0.600000
					if( avg2 > 494.651 )
						if( avg <= 505.454 )
							if( avg2 <= 502.762 )
								if( avg2 <= 500.707 )
									ret := 1.000000 // buy
								if( avg2 > 500.707 )
									ret := 0.375000
							if( avg2 > 502.762 )
								ret := -0.571429
						if( avg > 505.454 )
							if( avg2 <= 503.866 )
								ret := -0.400000
							if( avg2 > 503.866 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Ultimate_MA_MTF_V2 
//@version=5
//indicator title="CM_Ultimate_MA_MTF_V2", shorttitle="CM_Ultimate_MA_MTF_V2", overlay=true)

// Inputs
src = close
useCurrentRes = input(true, title="Use Current Chart Resolution?")
resCustom = input.timeframe(title="Use Different Timeframe? Uncheck Box Above", defval="D")
len = input.int(20, title="Moving Average Length - LookBack Period")
factorT3 = input.float(defval=7, title="Tilson T3 Factor - *.10 - so 7 = .7 etc.", minval=0)
atype = input.int(1, minval=1, maxval=8, title="1=SMA, 2=EMA, 3=WMA, 4=HullMA, 5=VWMA, 6=RMA, 7=TEMA, 8=Tilson T3")
spc = input(false, title="Show Price Crossing 1st Mov Avg - Highlight Bar?")
cc = input(true, title="Change Color Based On Direction?")
smoothe = input.int(2, minval=1, maxval=10, title="Color Smoothing - Setting 1 = No Smoothing")
doma2 = input(false, title="Optional 2nd Moving Average")
spc2 = input(false, title="Show Price Crossing 2nd Mov Avg?")
len2 = input.int(50, title="Moving Average Length - Optional 2nd MA")
sfactorT3 = input.float(defval=7, title="Tilson T3 Factor - *.10 - so 7 = .7 etc.", minval=0)
atype2 = input.int(1, minval=1, maxval=8, title="1=SMA, 2=EMA, 3=WMA, 4=HullMA, 5=VWMA, 6=RMA, 7=TEMA, 8=Tilson T3")
cc2 = input(true, title="Change Color Based On Direction 2nd MA?")
warn = input(false, title="***You Can Turn On The Show Dots Parameter Below Without Plotting 2nd MA to See Crosses***")
warn2 = input(false, title="***If Using Cross Feature W/O Plotting 2ndMA - Make Sure 2ndMA Parameters are Set Correctly***")
sd = input(false, title="Show Dots on Cross of Both MA's")

res = useCurrentRes ? timeframe.period : resCustom

// Hull MA definition
hullma = ta.wma(2 * ta.wma(src, len / 2) - ta.wma(src, len), math.round(math.sqrt(len)))

// TEMA definition
ema1 = ta.ema(src, len)
ema2 = ta.ema(ema1, len)
ema3 = ta.ema(ema2, len)
tema = 3 * (ema1 - ema2) + ema3

// Tilson T3 definition
factor = factorT3 * 0.10
gd(src, len, factor) => ta.ema(src, len) * (1 + factor) - ta.ema(ta.ema(src, len), len) * factor
t3(src, len, factor) => gd(gd(gd(src, len, factor), len, factor), len, factor)
tilT3 = t3(src, len, factor)

avg = atype == 1 ? ta.sma(src, len) : atype == 2 ? ta.ema(src, len) : atype == 3 ? ta.wma(src, len) : atype == 4 ? hullma : atype == 5 ? ta.vwma(src, len) : atype == 6 ? ta.rma(src, len) : atype == 7 ? tema : tilT3

// 2nd MA definitions
hullma2 = ta.wma(2 * ta.wma(src, len2 / 2) - ta.wma(src, len2), math.round(math.sqrt(len2)))
sema1 = ta.ema(src, len2)
sema2 = ta.ema(sema1, len2)
sema3 = ta.ema(sema2, len2)
stema = 3 * (sema1 - sema2) + sema3
sfactor = sfactorT3 * 0.10
sgd(src, len2, sfactor) => ta.ema(src, len2) * (1 + sfactor) - ta.ema(ta.ema(src, len2), len2) * sfactor
st3(src, len2, sfactor) => sgd(sgd(gd(src, len2, sfactor), len2, sfactor), len2, sfactor)
stilT3 = st3(src, len2, sfactor)

avg2 = atype2 == 1 ? ta.sma(src, len2) : atype2 == 2 ? ta.ema(src, len2) : atype2 == 3 ? ta.wma(src, len2) : atype2 == 4 ? hullma2 : atype2 == 5 ? ta.vwma(src, len2) : atype2 == 6 ? ta.rma(src, len2) : atype2 == 7 ? stema : stilT3

out1 = request.security(syminfo.tickerid, res, avg)
out2 = request.security(syminfo.tickerid, res, avg2)

// Formula for Price Crossing Moving Average #1
cr_up = open < out1 and close > out1
cr_down = open > out1 and close < out1

// Formula for Price Crossing Moving Average #2
cr_up2 = open < out2 and close > out2
cr_down2 = open > out2 and close < out2

// Barcolor Criteria for Price Crossing Moving Average #1
iscrossUp() => cr_up
iscrossDown() => cr_down

// Barcolor Criteria for Price Crossing Moving Average #2
iscrossUp2() => cr_up2
iscrossDown2() => cr_down2

ma_up = out1 >= ta.valuewhen(out1[smoothe] >= out1[1], out1[smoothe], 1)
ma_down = out1 < ta.valuewhen(out1[smoothe] < out1[1], out1[smoothe], 1)

col = cc ? (ma_up ? color.lime : ma_down ? color.red : color.aqua) : color.aqua
col2 = cc2 ? (ma_up ? color.lime : ma_down ? color.red : color.aqua) : color.white

plot(out1, title="Multi-Timeframe Moving Avg", linewidth=4, color=col)
plot(doma2 and out2 ? out2 : na, title="2nd Multi-TimeFrame Moving Average", linewidth=4, color=col2)
plot(sd and ta.crossover(out1, out2) ? out2 : na, style=plot.style_cross, linewidth=15, color=color.aqua)

// Barcolor Plot for Price Crossing Moving Average #1
barcolor(spc and iscrossUp() ? color.yellow : na)
barcolor(spc and iscrossDown() ? color.yellow : na)

// Barcolor Plot for Price Crossing Moving Average #2
barcolor(spc2 and iscrossUp2() ? color.yellow : na)
barcolor(spc2 and iscrossDown2() ? color.yellow : na)

cr_upInt = cr_up ? 1: 0    //Bool to int
cr_up2Int = cr_up2 ? 1: 0    //Bool to int
cr_downInt = cr_down ? 1: 0    //Bool to int
cr_down2Int = cr_down2 ? 1: 0    //Bool to int
ma_upInt = ma_up ? 1: 0    //Bool to int
ma_downInt = ma_down ? 1: 0    //Bool to int

// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_AAPL_30Min_8e6b2316(cr_up2Int, cr_downInt, avg2, avg, ma_downInt, cr_down2Int, cr_upInt, ma_upInt)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


