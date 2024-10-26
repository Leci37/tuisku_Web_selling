//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ultimate_MA_MTF_V2
// ID_model: NVDA_30Min_1ULT_16f25bb2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_1ULT_16f25bb2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_16f25bb2(ma_downInt, cr_upInt, avg2, cr_down2Int, cr_up2Int, cr_downInt, ma_upInt, avg)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ma_upInt <= 0.5 )
		if( avg2 <= 92.66 )
			if( avg2 <= 85.3958 )
				if( avg <= 60.1866 )
					if( avg2 <= 28.0961 )
						if( avg <= 25.6294 )
							if( avg <= 25.4961 )
								if( avg2 <= 25.8348 )
									ret := 0.720000 // buy
								if( avg2 > 25.8348 )
									ret := 0.000000
							if( avg > 25.4961 )
								if( avg2 <= 25.5474 )
									ret := 0.500000
								if( avg2 > 25.5474 )
									ret := -0.250000
						if( avg > 25.6294 )
							ret := -0.577778
					if( avg2 > 28.0961 )
						if( avg <= 28.0693 )
							if( avg <= 27.5224 )
								ret := 1.000000 // buy
							if( avg > 27.5224 )
								if( avg <= 27.7457 )
									ret := 0.250000
								if( avg > 27.7457 )
									ret := 0.926829 // buy
						if( avg > 28.0693 )
							if( avg2 <= 31.0463 )
								if( avg2 <= 29.918 )
									ret := 0.000000
								if( avg2 > 29.918 )
									ret := -0.482759
							if( avg2 > 31.0463 )
								if( avg <= 31.8892 )
									ret := 0.470149
								if( avg > 31.8892 )
									ret := 0.181066
				if( avg > 60.1866 )
					if( avg2 <= 62.8536 )
						if( avg2 <= 62.7036 )
							if( avg <= 61.0534 )
								if( avg2 <= 60.0061 )
									ret := 0.000000
								if( avg2 > 60.0061 )
									ret := -0.900000 // sell
							if( avg > 61.0534 )
								if( avg2 <= 61.8978 )
									ret := 0.571429
								if( avg2 > 61.8978 )
									ret := -0.208054
						if( avg2 > 62.7036 )
							if( avg <= 62.8828 )
								if( avg2 <= 62.7961 )
									ret := -0.740741 // sell
								if( avg2 > 62.7961 )
									ret := -0.941176 // sell
							if( avg > 62.8828 )
								ret := -0.235294
					if( avg2 > 62.8536 )
						if( avg2 <= 71.9053 )
							if( avg <= 66.0983 )
								if( cr_upInt <= 0.5 )
									ret := 0.418182
								if( cr_upInt > 0.5 )
									ret := 0.000000
							if( avg > 66.0983 )
								if( avg <= 68.8348 )
									ret := -0.065844
								if( avg > 68.8348 )
									ret := 0.312849
						if( avg2 > 71.9053 )
							if( ma_downInt <= 0.5 )
								ret := -1.000000 // sell
							if( ma_downInt > 0.5 )
								if( avg2 <= 77.5624 )
									ret := -0.666667
								if( avg2 > 77.5624 )
									ret := -0.100000
			if( avg2 > 85.3958 )
				if( avg <= 87.3062 )
					ret := 1.000000 // buy
				if( avg > 87.3062 )
					if( avg <= 88.9474 )
						if( avg2 <= 90.7189 )
							ret := -1.000000 // sell
						if( avg2 > 90.7189 )
							ret := -0.166667
					if( avg > 88.9474 )
						if( ma_downInt <= 0.5 )
							ret := 1.000000 // buy
						if( ma_downInt > 0.5 )
							if( avg <= 89.7062 )
								ret := 0.000000
							if( avg > 89.7062 )
								if( avg <= 92.4016 )
									ret := 0.700000 // buy
								if( avg > 92.4016 )
									ret := 0.000000
		if( avg2 > 92.66 )
			if( avg <= 92.9762 )
				if( avg2 <= 93.4208 )
					if( avg2 <= 92.9481 )
						ret := -0.750000 // sell
					if( avg2 > 92.9481 )
						ret := -1.000000 // sell
				if( avg2 > 93.4208 )
					ret := -0.250000
			if( avg > 92.9762 )
				if( ma_downInt <= 0.5 )
					if( avg2 <= 1123.03 )
						if( avg2 <= 334.531 )
							if( avg2 <= 325.427 )
								if( avg2 <= 267.032 )
									ret := 0.078029
								if( avg2 > 267.032 )
									ret := -0.095023
							if( avg2 > 325.427 )
								ret := -1.000000 // sell
						if( avg2 > 334.531 )
							if( avg2 <= 437.604 )
								if( avg <= 431.528 )
									ret := 0.286486
								if( avg > 431.528 )
									ret := 0.807692 // buy
							if( avg2 > 437.604 )
								if( avg <= 468.509 )
									ret := -0.169399
								if( avg > 468.509 )
									ret := 0.142659
					if( avg2 > 1123.03 )
						if( avg <= 1178.3 )
							if( avg2 <= 1142.77 )
								ret := -1.000000 // sell
							if( avg2 > 1142.77 )
								ret := 1.000000 // buy
						if( avg > 1178.3 )
							ret := -1.000000 // sell
				if( ma_downInt > 0.5 )
					if( avg <= 107.04 )
						if( avg2 <= 109.526 )
							if( avg <= 106.535 )
								if( avg <= 104.937 )
									ret := 0.080460
								if( avg > 104.937 )
									ret := -0.223602
							if( avg > 106.535 )
								if( avg2 <= 107.648 )
									ret := 0.756410 // buy
								if( avg2 > 107.648 )
									ret := -0.551724
						if( avg2 > 109.526 )
							if( avg <= 105.758 )
								if( avg2 <= 110.122 )
									ret := 0.750000 // buy
								if( avg2 > 110.122 )
									ret := -0.500000
							if( avg > 105.758 )
								if( avg2 <= 111.545 )
									ret := 1.000000 // buy
								if( avg2 > 111.545 )
									ret := 0.625000
					if( avg > 107.04 )
						if( avg <= 113.184 )
							if( avg <= 109.398 )
								if( avg2 <= 110.17 )
									ret := -0.240741
								if( avg2 > 110.17 )
									ret := 0.166667
							if( avg > 109.398 )
								if( avg2 <= 110.191 )
									ret := -0.108696
								if( avg2 > 110.191 )
									ret := -0.741667 // sell
						if( avg > 113.184 )
							if( avg2 <= 115.168 )
								if( avg2 <= 113.841 )
									ret := 0.227273
								if( avg2 > 113.841 )
									ret := 0.698113
							if( avg2 > 115.168 )
								if( avg <= 114.254 )
									ret := -0.537037
								if( avg > 114.254 )
									ret := -0.001801
	if( ma_upInt > 0.5 )
		if( avg <= 162.212 )
			if( avg <= 159.388 )
				if( avg2 <= 158.894 )
					if( avg <= 48.5646 )
						if( avg2 <= 27.4782 )
							if( avg2 <= 26.6358 )
								if( avg2 <= 26.0814 )
									ret := 0.472727
								if( avg2 > 26.0814 )
									ret := -0.538462
							if( avg2 > 26.6358 )
								if( avg <= 27.1535 )
									ret := 0.111111
								if( avg > 27.1535 )
									ret := 0.781250 // buy
						if( avg2 > 27.4782 )
							if( avg2 <= 28.2653 )
								if( avg <= 27.8836 )
									ret := -0.750000 // sell
								if( avg > 27.8836 )
									ret := -0.352941
							if( avg2 > 28.2653 )
								if( cr_downInt <= 0.5 )
									ret := 0.003422
								if( cr_downInt > 0.5 )
									ret := 0.122807
					if( avg > 48.5646 )
						if( avg2 <= 61.6607 )
							if( avg <= 58.8221 )
								if( cr_down2Int <= 0.5 )
									ret := 0.210884
								if( cr_down2Int > 0.5 )
									ret := -0.200000
							if( avg > 58.8221 )
								if( avg <= 61.9234 )
									ret := 0.626437
								if( avg > 61.9234 )
									ret := 0.206897
						if( avg2 > 61.6607 )
							if( cr_up2Int <= 0.5 )
								if( avg2 <= 71.5622 )
									ret := -0.057276
								if( avg2 > 71.5622 )
									ret := 0.145418
							if( cr_up2Int > 0.5 )
								if( avg <= 135.504 )
									ret := 0.128788
								if( avg > 135.504 )
									ret := -0.250000
				if( avg2 > 158.894 )
					if( avg <= 156.711 )
						if( avg2 <= 159.536 )
							ret := 0.500000
						if( avg2 > 159.536 )
							if( avg2 <= 228.466 )
								ret := 0.142857
							if( avg2 > 228.466 )
								ret := 0.000000
					if( avg > 156.711 )
						if( avg <= 159.214 )
							if( avg2 <= 160.457 )
								if( avg <= 157.749 )
									ret := -0.666667
								if( avg > 157.749 )
									ret := -0.888889 // sell
							if( avg2 > 160.457 )
								if( avg <= 158.859 )
									ret := 0.000000
								if( avg > 158.859 )
									ret := -0.500000
						if( avg > 159.214 )
							if( avg <= 159.283 )
								ret := 0.000000
							if( avg > 159.283 )
								ret := 0.250000
			if( avg > 159.388 )
				if( avg2 <= 163.221 )
					if( avg <= 161.637 )
						if( cr_upInt <= 0.5 )
							if( cr_up2Int <= 0.5 )
								if( avg <= 160.762 )
									ret := 0.430464
								if( avg > 160.762 )
									ret := 0.638298
							if( cr_up2Int > 0.5 )
								ret := 0.000000
						if( cr_upInt > 0.5 )
							if( avg <= 160.854 )
								ret := -0.166667
							if( avg > 160.854 )
								ret := 0.714286 // buy
					if( avg > 161.637 )
						if( cr_downInt <= 0.5 )
							if( avg2 <= 157.522 )
								ret := -0.333333
							if( avg2 > 157.522 )
								if( avg <= 161.973 )
									ret := 0.209677
								if( avg > 161.973 )
									ret := 0.500000
						if( cr_downInt > 0.5 )
							ret := 0.000000
				if( avg2 > 163.221 )
					if( avg <= 161.225 )
						ret := 0.428571
					if( avg > 161.225 )
						if( avg <= 161.879 )
							if( avg <= 161.393 )
								ret := -0.571429
							if( avg > 161.393 )
								if( cr_downInt <= 0.5 )
									ret := -0.952381 // sell
								if( cr_downInt > 0.5 )
									ret := -0.750000 // sell
						if( avg > 161.879 )
							if( avg <= 161.928 )
								ret := -0.250000
							if( avg > 161.928 )
								if( avg2 <= 163.472 )
									ret := 0.000000
								if( avg2 > 163.472 )
									ret := 0.500000
		if( avg > 162.212 )
			if( avg2 <= 573.193 )
				if( avg2 <= 161.472 )
					if( avg2 <= 159.527 )
						if( avg <= 162.398 )
							if( avg2 <= 159.349 )
								ret := 0.250000
							if( avg2 > 159.349 )
								ret := 0.666667
						if( avg > 162.398 )
							if( avg2 <= 158.681 )
								if( avg <= 163.293 )
									ret := -0.285714
								if( avg > 163.293 )
									ret := 0.750000 // buy
							if( avg2 > 158.681 )
								if( avg <= 162.772 )
									ret := 0.000000
								if( avg > 162.772 )
									ret := -0.714286 // sell
					if( avg2 > 159.527 )
						if( avg <= 162.809 )
							if( avg <= 162.477 )
								if( avg2 <= 159.907 )
									ret := -0.600000
								if( avg2 > 159.907 )
									ret := 0.000000
							if( avg > 162.477 )
								ret := 0.192308
						if( avg > 162.809 )
							if( avg <= 166.517 )
								if( avg2 <= 160.765 )
									ret := -0.680851
								if( avg2 > 160.765 )
									ret := -0.448718
							if( avg > 166.517 )
								ret := 0.714286 // buy
				if( avg2 > 161.472 )
					if( avg <= 162.381 )
						if( avg <= 162.286 )
							if( avg <= 162.253 )
								ret := -0.400000
							if( avg > 162.253 )
								ret := -1.000000 // sell
						if( avg > 162.286 )
							if( avg <= 162.313 )
								ret := 0.000000
							if( avg > 162.313 )
								ret := -0.857143 // sell
					if( avg > 162.381 )
						if( cr_up2Int <= 0.5 )
							if( avg2 <= 223.963 )
								if( avg2 <= 210.266 )
									ret := 0.060444
								if( avg2 > 210.266 )
									ret := 0.162133
							if( avg2 > 223.963 )
								if( avg <= 218.317 )
									ret := 0.656250
								if( avg > 218.317 )
									ret := 0.032040
						if( cr_up2Int > 0.5 )
							if( avg <= 191.931 )
								if( avg2 <= 190.208 )
									ret := -0.068493
								if( avg2 > 190.208 )
									ret := -0.869565 // sell
							if( avg > 191.931 )
								if( avg2 <= 224.655 )
									ret := 0.145833
								if( avg2 > 224.655 )
									ret := -0.043919
			if( avg2 > 573.193 )
				if( cr_up2Int <= 0.5 )
					if( avg <= 608.585 )
						if( avg <= 601.811 )
							if( cr_down2Int <= 0.5 )
								if( avg <= 576.501 )
									ret := 0.840000 // buy
								if( avg > 576.501 )
									ret := 0.215768
							if( cr_down2Int > 0.5 )
								ret := 0.000000
						if( avg > 601.811 )
							if( avg <= 604.185 )
								if( avg <= 602.806 )
									ret := 0.714286 // buy
								if( avg > 602.806 )
									ret := 0.920000 // buy
							if( avg > 604.185 )
								if( avg2 <= 602.26 )
									ret := 0.823529 // buy
								if( avg2 > 602.26 )
									ret := 0.217391
					if( avg > 608.585 )
						if( avg2 <= 967.482 )
							if( avg <= 874.607 )
								if( avg <= 836.701 )
									ret := 0.083990
								if( avg > 836.701 )
									ret := 0.363958
							if( avg > 874.607 )
								if( avg <= 878.55 )
									ret := -0.459459
								if( avg > 878.55 )
									ret := 0.025180
						if( avg2 > 967.482 )
							if( avg2 <= 1199.5 )
								if( avg <= 1155.02 )
									ret := 0.286458
								if( avg > 1155.02 )
									ret := 0.780822 // buy
							if( avg2 > 1199.5 )
								if( avg <= 1203.88 )
									ret := -0.428571
								if( avg > 1203.88 )
									ret := -1.000000 // sell
				if( cr_up2Int > 0.5 )
					if( cr_upInt <= 0.5 )
						if( avg2 <= 829.496 )
							if( avg2 <= 699.905 )
								if( avg2 <= 617.52 )
									ret := 0.000000
								if( avg2 > 617.52 )
									ret := 0.000000
							if( avg2 > 699.905 )
								if( avg <= 722.225 )
									ret := 0.500000
								if( avg > 722.225 )
									ret := 0.285714
						if( avg2 > 829.496 )
							if( avg2 <= 859.849 )
								ret := -1.000000 // sell
							if( avg2 > 859.849 )
								if( avg <= 879.543 )
									ret := 0.000000
								if( avg > 879.543 )
									ret := -0.428571
					if( cr_upInt > 0.5 )
						if( avg <= 765.578 )
							ret := -0.800000 // sell
						if( avg > 765.578 )
							if( avg <= 869.499 )
								ret := -0.250000
							if( avg > 869.499 )
								ret := 0.000000
	
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
float op_operation = decision_tree_0_NVDA_30Min_16f25bb2(ma_downInt, cr_upInt, avg2, cr_down2Int, cr_up2Int, cr_downInt, ma_upInt, avg)

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


