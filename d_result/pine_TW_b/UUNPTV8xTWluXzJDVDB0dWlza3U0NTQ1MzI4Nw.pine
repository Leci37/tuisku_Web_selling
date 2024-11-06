//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: QCOM_1Min_2CT0_45453287 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Min_2CT0_45453287", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Min_45453287(ad_mf, mf, ad, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ad_mf <= 352.96 )
		if( ema13 <= -0.692171 )
			if( ad_mf <= -1143.41 )
				if( ema2 <= 211.685 )
					if( ema2 <= 174.679 )
						if( tema <= 160.938 )
							if( ad <= -2833.63 )
								if( ema1 <= 159.036 )
									ret := 0.714286 // buy
								if( ema1 > 159.036 )
									ret := -0.030303
							if( ad > -2833.63 )
								if( mf <= -0.200499 )
									ret := -0.142857
								if( mf > -0.200499 )
									ret := -0.960000 // sell
						if( tema > 160.938 )
							if( ad <= -19586.1 )
								if( mf <= -0.271714 )
									ret := 0.372093
								if( mf > -0.271714 )
									ret := -0.338983
							if( ad > -19586.1 )
								if( ad <= -3525.92 )
									ret := 0.669856
								if( ad > -3525.92 )
									ret := 0.062500
					if( ema2 > 174.679 )
						if( ema12 <= -1.28229 )
							if( ema1 <= 183.227 )
								ret := -0.400000
							if( ema1 > 183.227 )
								ret := -1.000000 // sell
						if( ema12 > -1.28229 )
							if( ema12 <= -0.612335 )
								if( ad <= -49944.5 )
									ret := 0.630769
								if( ad > -49944.5 )
									ret := 0.204545
							if( ema12 > -0.612335 )
								if( ema13 <= -1.07156 )
									ret := 0.823529 // buy
								if( ema13 > -1.07156 )
									ret := -0.152749
				if( ema2 > 211.685 )
					if( ema2 <= 215.119 )
						if( ad_mf <= -44955.8 )
							ret := 0.833333 // buy
						if( ad_mf > -44955.8 )
							ret := 1.000000 // buy
					if( ema2 > 215.119 )
						if( mf <= -0.13931 )
							if( ad <= -48164 )
								ret := -0.421053
							if( ad > -48164 )
								if( ema12 <= -0.632252 )
									ret := 1.000000 // buy
								if( ema12 > -0.632252 )
									ret := 0.000000
						if( mf > -0.13931 )
							ret := 0.870968 // buy
			if( ad_mf > -1143.41 )
				if( tema <= 164.2 )
					if( ema12 <= -0.30933 )
						if( tema <= 157.005 )
							if( ad_mf <= 0.046222 )
								if( tema <= 156.385 )
									ret := 1.000000 // buy
								if( tema > 156.385 )
									ret := 0.909091 // buy
							if( ad_mf > 0.046222 )
								ret := 0.800000 // buy
						if( tema > 157.005 )
							if( ema2 <= 159.728 )
								ret := -0.545455
							if( ema2 > 159.728 )
								if( tema <= 163.201 )
									ret := 0.652174
								if( tema > 163.201 )
									ret := 1.000000 // buy
					if( ema12 > -0.30933 )
						ret := -0.333333
				if( tema > 164.2 )
					if( ema2 <= 190.954 )
						if( ema1 <= 180.303 )
							if( ema12 <= -0.504326 )
								if( mf <= -0.172188 )
									ret := 0.690476
								if( mf > -0.172188 )
									ret := 0.266667
							if( ema12 > -0.504326 )
								if( ad_mf <= 0.335205 )
									ret := -0.253731
								if( ad_mf > 0.335205 )
									ret := 0.636364
						if( ema1 > 180.303 )
							ret := -1.000000 // sell
					if( ema2 > 190.954 )
						if( ema1 <= 200.601 )
							if( mf <= -0.00992 )
								ret := 0.619048
							if( mf > -0.00992 )
								ret := 1.000000 // buy
						if( ema1 > 200.601 )
							if( tema <= 209.173 )
								if( ad_mf <= 0.44185 )
									ret := -0.180000
								if( ad_mf > 0.44185 )
									ret := 0.914286 // buy
							if( tema > 209.173 )
								if( ema13 <= -0.810819 )
									ret := 0.038462
								if( ema13 > -0.810819 )
									ret := 0.877551 // buy
		if( ema13 > -0.692171 )
			if( mf <= -0.324301 )
				if( ema2 <= 208.638 )
					if( mf <= -0.88865 )
						if( mf <= -0.972732 )
							if( ema1 <= 207.042 )
								ret := 0.153846
							if( ema1 > 207.042 )
								ret := -0.666667
						if( mf > -0.972732 )
							if( ad_mf <= 0.901547 )
								if( ema3 <= 168.504 )
									ret := 0.600000
								if( ema3 > 168.504 )
									ret := 0.428571
							if( ad_mf > 0.901547 )
								if( ema2 <= 168.119 )
									ret := 0.961538 // buy
								if( ema2 > 168.119 )
									ret := 0.882353 // buy
					if( mf > -0.88865 )
						if( ema13 <= 0.33385 )
							if( ad_mf <= -61221.9 )
								if( ad_mf <= -177241 )
									ret := 0.358025
								if( ad_mf > -177241 )
									ret := 0.663551
							if( ad_mf > -61221.9 )
								if( tema <= 208.183 )
									ret := 0.129438
								if( tema > 208.183 )
									ret := 1.000000 // buy
						if( ema13 > 0.33385 )
							if( tema <= 193.3 )
								if( ad <= -497.313 )
									ret := 0.283333
								if( ad > -497.313 )
									ret := -0.184783
							if( tema > 193.3 )
								if( ema13 <= 0.501183 )
									ret := -0.859155 // sell
								if( ema13 > 0.501183 )
									ret := 0.444444
				if( ema2 > 208.638 )
					if( ema12 <= 0.231712 )
						if( ema3 <= 209.165 )
							if( mf <= -0.36165 )
								ret := -0.846154 // sell
							if( mf > -0.36165 )
								ret := -0.181818
						if( ema3 > 209.165 )
							if( ad_mf <= -5347.15 )
								if( ema3 <= 216.456 )
									ret := -0.286822
								if( ema3 > 216.456 )
									ret := 0.538462
							if( ad_mf > -5347.15 )
								if( ema12 <= -0.234887 )
									ret := -0.279070
								if( ema12 > -0.234887 )
									ret := 0.294372
					if( ema12 > 0.231712 )
						if( ema2 <= 228.151 )
							if( ema1 <= 212.326 )
								ret := -1.000000 // sell
							if( ema1 > 212.326 )
								if( ema3 <= 226.943 )
									ret := -0.210526
								if( ema3 > 226.943 )
									ret := -1.000000 // sell
						if( ema2 > 228.151 )
							ret := 0.076923
			if( mf > -0.324301 )
				if( tema <= 229.335 )
					if( tema <= 150.191 )
						if( ema13 <= -0.133757 )
							if( ema2 <= 150.212 )
								ret := 1.000000 // buy
							if( ema2 > 150.212 )
								ret := 0.777778 // buy
						if( ema13 > -0.133757 )
							if( mf <= 0.178878 )
								ret := -0.200000
							if( mf > 0.178878 )
								ret := 0.937500 // buy
					if( tema > 150.191 )
						if( mf <= -0.00132 )
							if( tema <= 198.221 )
								if( ema3 <= 150.957 )
									ret := -0.928571 // sell
								if( ema3 > 150.957 )
									ret := -0.045546
							if( tema > 198.221 )
								if( ema3 <= 200.344 )
									ret := 0.294239
								if( ema3 > 200.344 )
									ret := 0.031670
						if( mf > -0.00132 )
							if( ad_mf <= -8859.99 )
								if( ad <= -10154 )
									ret := 0.059322
								if( ad > -10154 )
									ret := 0.287591
							if( ad_mf > -8859.99 )
								if( ad <= -7997.03 )
									ret := -0.327044
								if( ad > -7997.03 )
									ret := 0.034062
				if( tema > 229.335 )
					if( ad_mf <= -2242.26 )
						ret := 0.000000
					if( ad_mf > -2242.26 )
						if( ad_mf <= -427.56 )
							ret := -0.500000
						if( ad_mf > -427.56 )
							if( ema2 <= 229.483 )
								if( ema1 <= 229.259 )
									ret := -0.925000 // sell
								if( ema1 > 229.259 )
									ret := -0.454545
							if( ema2 > 229.483 )
								ret := -1.000000 // sell
	if( ad_mf > 352.96 )
		if( ema12 <= 0.306373 )
			if( ema2 <= 158.203 )
				if( tema <= 151.179 )
					if( ad_mf <= 1511.39 )
						ret := 1.000000 // buy
					if( ad_mf > 1511.39 )
						ret := 0.500000
				if( tema > 151.179 )
					if( ema3 <= 157.405 )
						if( ema1 <= 157.297 )
							if( ad <= 6054.3 )
								if( mf <= -0.074957 )
									ret := 0.809524 // buy
								if( mf > -0.074957 )
									ret := -0.444444
							if( ad > 6054.3 )
								if( ad_mf <= 12100.9 )
									ret := 0.750000 // buy
								if( ad_mf > 12100.9 )
									ret := 0.062500
						if( ema1 > 157.297 )
							ret := -0.466667
					if( ema3 > 157.405 )
						if( ad_mf <= 7313.64 )
							if( ema2 <= 157.675 )
								if( ad <= 1159.94 )
									ret := 1.000000 // buy
								if( ad > 1159.94 )
									ret := 0.761905 // buy
							if( ema2 > 157.675 )
								if( ad <= 2352.37 )
									ret := 0.047619
								if( ad > 2352.37 )
									ret := 0.543478
						if( ad_mf > 7313.64 )
							if( ad <= 7647.35 )
								ret := -0.500000
							if( ad > 7647.35 )
								if( ema13 <= 0.013651 )
									ret := 0.417910
								if( ema13 > 0.013651 )
									ret := -0.184211
			if( ema2 > 158.203 )
				if( ema1 <= 203.869 )
					if( ad_mf <= 215816 )
						if( ema13 <= -0.385565 )
							if( mf <= -0.432982 )
								if( tema <= 192.205 )
									ret := 0.075269
								if( tema > 192.205 )
									ret := 0.815789 // buy
							if( mf > -0.432982 )
								if( ad_mf <= 42079.7 )
									ret := -0.137350
								if( ad_mf > 42079.7 )
									ret := 0.291080
						if( ema13 > -0.385565 )
							if( ad <= 18924.8 )
								if( ad_mf <= 18736.2 )
									ret := -0.009233
								if( ad_mf > 18736.2 )
									ret := -0.655172
							if( ad > 18924.8 )
								if( ad_mf <= 20876.4 )
									ret := 0.332410
								if( ad_mf > 20876.4 )
									ret := 0.018230
					if( ad_mf > 215816 )
						if( ema3 <= 177.224 )
							if( ad_mf <= 1.24207e+06 )
								ret := 0.210526
							if( ad_mf > 1.24207e+06 )
								if( ema3 <= 171.796 )
									ret := -1.000000 // sell
								if( ema3 > 171.796 )
									ret := -0.300000
						if( ema3 > 177.224 )
							if( ad <= 405273 )
								ret := -1.000000 // sell
							if( ad > 405273 )
								ret := -0.760000 // sell
				if( ema1 > 203.869 )
					if( ema2 <= 204.49 )
						if( ad_mf <= 15444 )
							if( ad <= 12078.6 )
								if( ema13 <= 0.268523 )
									ret := -0.148571
								if( ema13 > 0.268523 )
									ret := -0.551020
							if( ad > 12078.6 )
								if( tema <= 204.345 )
									ret := -0.909091 // sell
								if( tema > 204.345 )
									ret := -0.583333
						if( ad_mf > 15444 )
							if( ema13 <= 0.185545 )
								if( mf <= 0.067099 )
									ret := 0.166667
								if( mf > 0.067099 )
									ret := -0.550000
							if( ema13 > 0.185545 )
								if( ema2 <= 204.21 )
									ret := 0.611111
								if( ema2 > 204.21 )
									ret := 0.000000
					if( ema2 > 204.49 )
						if( ema13 <= -0.36818 )
							if( ema13 <= -0.418777 )
								if( ema3 <= 205.086 )
									ret := 0.666667
								if( ema3 > 205.086 )
									ret := -0.033465
							if( ema13 > -0.418777 )
								if( ema2 <= 206.736 )
									ret := 0.648649
								if( ema2 > 206.736 )
									ret := 0.197183
						if( ema13 > -0.36818 )
							if( ema13 <= 0.336242 )
								if( ad_mf <= 13121.1 )
									ret := -0.068354
								if( ad_mf > 13121.1 )
									ret := -0.192905
							if( ema13 > 0.336242 )
								if( tema <= 214.851 )
									ret := 0.140306
								if( tema > 214.851 )
									ret := -0.165468
		if( ema12 > 0.306373 )
			if( tema <= 200.842 )
				if( ad_mf <= 10212.2 )
					if( ema13 <= 0.522442 )
						if( ema3 <= 166.325 )
							ret := -0.428571
						if( ema3 > 166.325 )
							if( ema1 <= 189.436 )
								ret := -1.000000 // sell
							if( ema1 > 189.436 )
								if( ema12 <= 0.326746 )
									ret := -0.583333
								if( ema12 > 0.326746 )
									ret := -0.916667 // sell
					if( ema13 > 0.522442 )
						if( ema3 <= 163.127 )
							if( ema1 <= 159.159 )
								if( ema12 <= 0.572506 )
									ret := -0.666667
								if( ema12 > 0.572506 )
									ret := 0.083333
							if( ema1 > 159.159 )
								if( ema2 <= 160.55 )
									ret := 0.687500
								if( ema2 > 160.55 )
									ret := -0.111111
						if( ema3 > 163.127 )
							if( ema3 <= 191.745 )
								if( ad <= 800.719 )
									ret := 0.080000
								if( ad > 800.719 )
									ret := -0.498054
							if( ema3 > 191.745 )
								if( ema12 <= 0.429817 )
									ret := -0.372549
								if( ema12 > 0.429817 )
									ret := 0.937500 // buy
				if( ad_mf > 10212.2 )
					if( ema3 <= 174.56 )
						if( ad_mf <= 256759 )
							if( tema <= 169.184 )
								if( ema12 <= 0.73761 )
									ret := -0.010471
								if( ema12 > 0.73761 )
									ret := -0.807692 // sell
							if( tema > 169.184 )
								if( ema3 <= 169.479 )
									ret := -0.846154 // sell
								if( ema3 > 169.479 )
									ret := -0.322917
						if( ad_mf > 256759 )
							ret := 0.900000 // buy
					if( ema3 > 174.56 )
						if( ad <= 12441.8 )
							if( mf <= 0.157938 )
								ret := 0.714286 // buy
							if( mf > 0.157938 )
								ret := 1.000000 // buy
						if( ad > 12441.8 )
							if( ema12 <= 0.617107 )
								if( ema3 <= 175.276 )
									ret := 0.750000 // buy
								if( ema3 > 175.276 )
									ret := -0.102804
							if( ema12 > 0.617107 )
								if( ema1 <= 192.9 )
									ret := 0.247059
								if( ema1 > 192.9 )
									ret := 0.944444 // buy
			if( tema > 200.842 )
				if( ema12 <= 0.397132 )
					if( ema13 <= 0.515369 )
						if( ema3 <= 203.997 )
							ret := -0.941176 // sell
						if( ema3 > 203.997 )
							if( tema <= 207.784 )
								ret := 0.000000
							if( tema > 207.784 )
								ret := -0.647059
					if( ema13 > 0.515369 )
						if( ema2 <= 217.007 )
							if( ad_mf <= 28512.5 )
								if( mf <= -0.081605 )
									ret := 0.769231 // buy
								if( mf > -0.081605 )
									ret := -0.020000
							if( ad_mf > 28512.5 )
								if( ema12 <= 0.328413 )
									ret := -0.777778 // sell
								if( ema12 > 0.328413 )
									ret := -0.280000
						if( ema2 > 217.007 )
							ret := -0.857143 // sell
				if( ema12 > 0.397132 )
					if( ad <= 2217.81 )
						if( ad <= 856.5 )
							ret := -0.461538
						if( ad > 856.5 )
							if( ema3 <= 210.177 )
								ret := -1.000000 // sell
							if( ema3 > 210.177 )
								if( ema12 <= 0.481676 )
									ret := -0.500000
								if( ema12 > 0.481676 )
									ret := -1.000000 // sell
					if( ad > 2217.81 )
						if( tema <= 209.644 )
							if( ema13 <= 0.647274 )
								ret := -0.909091 // sell
							if( ema13 > 0.647274 )
								if( ema2 <= 204.043 )
									ret := -0.444444
								if( ema2 > 204.043 )
									ret := -0.045455
						if( tema > 209.644 )
							if( ema13 <= 0.773033 )
								if( mf <= 0.131497 )
									ret := -1.000000 // sell
								if( mf > 0.131497 )
									ret := -0.777778 // sell
							if( ema13 > 0.773033 )
								if( ema12 <= 0.5614 )
									ret := -0.157895
								if( ema12 > 0.5614 )
									ret := -0.761905 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_QCOM_1Min_45453287(ad_mf, mf, ad, ema2, ema1, ema12, ema3, ema13, tema)

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


