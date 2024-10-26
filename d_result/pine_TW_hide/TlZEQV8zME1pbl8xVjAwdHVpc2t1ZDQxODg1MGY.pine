//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Vortex_Indicator
// ID_model: NVDA_30Min_1V00_d418850f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_1V00_d418850f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_d418850f(VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( VIP <= 1.18994 )
		if( VIP_VIM <= -0.612724 )
			if( VIM <= 1.53251 )
				if( VIP <= 0.624214 )
					if( VIM <= 1.39186 )
						if( VIP_VIM <= -0.866158 )
							ret := 0.833333 // buy
						if( VIP_VIM > -0.866158 )
							if( VIP <= 0.605744 )
								if( VIM <= 1.3812 )
									ret := -0.082324
								if( VIM > 1.3812 )
									ret := -0.650000
							if( VIP > 0.605744 )
								if( VIP <= 0.618457 )
									ret := -0.631579
								if( VIP > 0.618457 )
									ret := -0.313433
					if( VIM > 1.39186 )
						if( VIP <= 0.576465 )
							if( VIP <= 0.562954 )
								if( VIP_VIM <= -0.892898 )
									ret := -0.101523
								if( VIP_VIM > -0.892898 )
									ret := 0.583333
							if( VIP > 0.562954 )
								if( VIP <= 0.570686 )
									ret := -0.277778
								if( VIP > 0.570686 )
									ret := 0.000000
						if( VIP > 0.576465 )
							if( VIP_VIM <= -0.889186 )
								if( VIP <= 0.585754 )
									ret := 0.777778 // buy
								if( VIP > 0.585754 )
									ret := 0.900000 // buy
							if( VIP_VIM > -0.889186 )
								if( VIP <= 0.582576 )
									ret := 0.933333 // buy
								if( VIP > 0.582576 )
									ret := 0.142857
				if( VIP > 0.624214 )
					if( VIP_VIM <= -0.651998 )
						if( VIM <= 1.51049 )
							if( VIM <= 1.49757 )
								if( VIM <= 1.42846 )
									ret := 0.100746
								if( VIM > 1.42846 )
									ret := -0.162679
							if( VIM > 1.49757 )
								if( VIP <= 0.737343 )
									ret := -0.166667
								if( VIP > 0.737343 )
									ret := 0.833333 // buy
						if( VIM > 1.51049 )
							if( VIP_VIM <= -0.711904 )
								if( VIP_VIM <= -0.761528 )
									ret := -0.750000 // sell
								if( VIP_VIM > -0.761528 )
									ret := 0.307692
							if( VIP_VIM > -0.711904 )
								if( VIP_VIM <= -0.700406 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.700406 )
									ret := -0.785714 // sell
					if( VIP_VIM > -0.651998 )
						if( VIP_VIM <= -0.637644 )
							if( VIP_VIM <= -0.640287 )
								if( VIP <= 0.645967 )
									ret := 0.833333 // buy
								if( VIP > 0.645967 )
									ret := 0.258537
							if( VIP_VIM > -0.640287 )
								if( VIP <= 0.715807 )
									ret := 0.724138 // buy
								if( VIP > 0.715807 )
									ret := 0.500000
						if( VIP_VIM > -0.637644 )
							if( VIP_VIM <= -0.612919 )
								if( VIP <= 0.720157 )
									ret := 0.041401
								if( VIP > 0.720157 )
									ret := 0.300971
							if( VIP_VIM > -0.612919 )
								ret := 0.750000 // buy
			if( VIM > 1.53251 )
				if( VIP <= 0.515812 )
					if( VIM <= 1.62595 )
						if( VIM <= 1.5652 )
							if( VIM <= 1.54651 )
								ret := 0.111111
							if( VIM > 1.54651 )
								ret := -0.833333 // sell
						if( VIM > 1.5652 )
							if( VIM <= 1.58576 )
								ret := 0.333333
							if( VIM > 1.58576 )
								ret := -0.052632
					if( VIM > 1.62595 )
						if( VIP <= 0.487042 )
							ret := -0.800000 // sell
						if( VIP > 0.487042 )
							ret := -0.500000
				if( VIP > 0.515812 )
					if( VIP <= 0.658424 )
						if( VIM <= 1.58023 )
							if( VIP_VIM <= -0.965965 )
								ret := 0.454545
							if( VIP_VIM > -0.965965 )
								if( VIM <= 1.54019 )
									ret := 0.800000 // buy
								if( VIM > 1.54019 )
									ret := 1.000000 // buy
						if( VIM > 1.58023 )
							ret := 0.571429
					if( VIP > 0.658424 )
						if( VIP <= 0.795736 )
							if( VIM <= 1.58758 )
								if( VIP_VIM <= -0.811293 )
									ret := 0.083333
								if( VIP_VIM > -0.811293 )
									ret := 0.461538
							if( VIM > 1.58758 )
								if( VIP <= 0.69622 )
									ret := -0.769231 // sell
								if( VIP > 0.69622 )
									ret := -0.125000
						if( VIP > 0.795736 )
							if( VIP <= 1.14771 )
								if( VIM <= 1.60908 )
									ret := 0.741176 // buy
								if( VIM > 1.60908 )
									ret := 0.280000
							if( VIP > 1.14771 )
								ret := 0.933333 // buy
		if( VIP_VIM > -0.612724 )
			if( VIP <= 0.566618 )
				ret := -1.000000 // sell
			if( VIP > 0.566618 )
				if( VIP <= 0.814397 )
					if( VIP_VIM <= -0.047178 )
						if( VIM <= 1.28936 )
							if( VIP <= 0.627147 )
								if( VIM <= 1.19026 )
									ret := 0.323944
								if( VIM > 1.19026 )
									ret := 1.000000 // buy
							if( VIP > 0.627147 )
								if( VIP_VIM <= -0.594877 )
									ret := -0.416667
								if( VIP_VIM > -0.594877 )
									ret := -0.082887
						if( VIM > 1.28936 )
							if( VIP <= 0.799667 )
								if( VIM <= 1.30056 )
									ret := 0.403900
								if( VIM > 1.30056 )
									ret := -0.005714
							if( VIP > 0.799667 )
								if( VIP <= 0.813149 )
									ret := -0.144928
								if( VIP > 0.813149 )
									ret := -0.555556
					if( VIP_VIM > -0.047178 )
						if( VIP <= 0.793183 )
							ret := 0.076923
						if( VIP > 0.793183 )
							if( VIP <= 0.801521 )
								ret := -1.000000 // sell
							if( VIP > 0.801521 )
								ret := -0.555556
				if( VIP > 0.814397 )
					if( VIP_VIM <= -0.372354 )
						if( VIP_VIM <= -0.379329 )
							if( VIP <= 0.833796 )
								if( VIM <= 1.42061 )
									ret := 0.195266
								if( VIM > 1.42061 )
									ret := 0.971429 // buy
							if( VIP > 0.833796 )
								if( VIP_VIM <= -0.59518 )
									ret := -0.347826
								if( VIP_VIM > -0.59518 )
									ret := 0.025227
						if( VIP_VIM > -0.379329 )
							if( VIP <= 1.06828 )
								if( VIP_VIM <= -0.372916 )
									ret := 0.502564
								if( VIP_VIM > -0.372916 )
									ret := 0.050000
							if( VIP > 1.06828 )
								if( VIM <= 1.49192 )
									ret := -0.181818
								if( VIM > 1.49192 )
									ret := 0.125000
					if( VIP_VIM > -0.372354 )
						if( VIP_VIM <= 0.420946 )
							if( VIP <= 1.15206 )
								if( VIP <= 1.13941 )
									ret := -0.016324
								if( VIP > 1.13941 )
									ret := -0.118304
							if( VIP > 1.15206 )
								if( VIM <= 1.20824 )
									ret := 0.002126
								if( VIM > 1.20824 )
									ret := 0.299694
						if( VIP_VIM > 0.420946 )
							if( VIP_VIM <= 0.462482 )
								if( VIP <= 1.0746 )
									ret := 0.285714
								if( VIP > 1.0746 )
									ret := -0.521739
							if( VIP_VIM > 0.462482 )
								if( VIP_VIM <= 0.667113 )
									ret := 0.111111
								if( VIP_VIM > 0.667113 )
									ret := -0.800000 // sell
	if( VIP > 1.18994 )
		if( VIM <= 0.795469 )
			if( VIP_VIM <= 0.958515 )
				if( VIM <= 0.620934 )
					if( VIP_VIM <= 0.934231 )
						if( VIP <= 1.32223 )
							if( VIP <= 1.20556 )
								if( VIP <= 1.20036 )
									ret := 0.300000
								if( VIP > 1.20036 )
									ret := 0.818182 // buy
							if( VIP > 1.20556 )
								if( VIP_VIM <= 0.757354 )
									ret := -0.175758
								if( VIP_VIM > 0.757354 )
									ret := 0.500000
						if( VIP > 1.32223 )
							if( VIM <= 0.614919 )
								if( VIP <= 1.43614 )
									ret := 0.245847
								if( VIP > 1.43614 )
									ret := 0.068592
							if( VIM > 0.614919 )
								if( VIM <= 0.618837 )
									ret := 0.720588 // buy
								if( VIM > 0.618837 )
									ret := 0.387097
					if( VIP_VIM > 0.934231 )
						if( VIP <= 1.47377 )
							if( VIM <= 0.508572 )
								ret := -0.636364
							if( VIM > 0.508572 )
								ret := -0.928571 // sell
						if( VIP > 1.47377 )
							if( VIP <= 1.52786 )
								ret := 0.000000
							if( VIP > 1.52786 )
								ret := -0.083333
				if( VIM > 0.620934 )
					if( VIP <= 1.20467 )
						if( VIM <= 0.749342 )
							if( VIM <= 0.744396 )
								if( VIM <= 0.723464 )
									ret := 0.716216 // buy
								if( VIM > 0.723464 )
									ret := 0.242424
							if( VIM > 0.744396 )
								ret := 0.950000 // buy
						if( VIM > 0.749342 )
							if( VIM <= 0.775172 )
								if( VIP_VIM <= 0.429225 )
									ret := -0.218182
								if( VIP_VIM > 0.429225 )
									ret := 0.391304
							if( VIM > 0.775172 )
								if( VIP <= 1.19085 )
									ret := 0.681818
								if( VIP > 1.19085 )
									ret := 0.285714
					if( VIP > 1.20467 )
						if( VIP <= 1.22857 )
							if( VIP <= 1.2105 )
								if( VIP <= 1.20518 )
									ret := -0.476190
								if( VIP > 1.20518 )
									ret := 0.229665
							if( VIP > 1.2105 )
								if( VIP_VIM <= 0.435372 )
									ret := -0.415842
								if( VIP_VIM > 0.435372 )
									ret := -0.050654
						if( VIP > 1.22857 )
							if( VIM <= 0.71097 )
								if( VIM <= 0.708669 )
									ret := 0.037754
								if( VIM > 0.708669 )
									ret := -0.269841
							if( VIM > 0.71097 )
								if( VIP_VIM <= 0.723925 )
									ret := 0.159155
								if( VIP_VIM > 0.723925 )
									ret := -0.116208
			if( VIP_VIM > 0.958515 )
				if( VIP <= 1.56913 )
					if( VIM <= 0.509797 )
						if( VIM <= 0.505617 )
							if( VIP_VIM <= 0.971746 )
								ret := -0.153846
							if( VIP_VIM > 0.971746 )
								if( VIP_VIM <= 1.01304 )
									ret := 0.360000
								if( VIP_VIM > 1.01304 )
									ret := 0.604396
						if( VIM > 0.505617 )
							ret := -0.090909
					if( VIM > 0.509797 )
						if( VIM <= 0.545282 )
							if( VIP <= 1.52852 )
								if( VIP <= 1.49851 )
									ret := 0.916667 // buy
								if( VIP > 1.49851 )
									ret := 0.375000
							if( VIP > 1.52852 )
								if( VIM <= 0.532881 )
									ret := 0.636364
								if( VIM > 0.532881 )
									ret := 0.941176 // buy
						if( VIM > 0.545282 )
							if( VIP_VIM <= 0.969886 )
								ret := 0.666667
							if( VIP_VIM > 0.969886 )
								if( VIP <= 1.55367 )
									ret := -0.066667
								if( VIP > 1.55367 )
									ret := 0.818182 // buy
				if( VIP > 1.56913 )
					if( VIP_VIM <= 1.00466 )
						if( VIP <= 1.69478 )
							if( VIP_VIM <= 0.990894 )
								if( VIP <= 1.61718 )
									ret := 0.318182
								if( VIP > 1.61718 )
									ret := 0.666667
							if( VIP_VIM > 0.990894 )
								ret := 0.937500 // buy
						if( VIP > 1.69478 )
							ret := 0.000000
					if( VIP_VIM > 1.00466 )
						if( VIM <= 0.515701 )
							if( VIP <= 1.63878 )
								if( VIP_VIM <= 1.17901 )
									ret := -0.594595
								if( VIP_VIM > 1.17901 )
									ret := -1.000000 // sell
							if( VIP > 1.63878 )
								ret := 0.000000
						if( VIM > 0.515701 )
							if( VIP_VIM <= 1.06862 )
								if( VIP <= 1.62125 )
									ret := 0.500000
								if( VIP > 1.62125 )
									ret := -0.410959
							if( VIP_VIM > 1.06862 )
								if( VIP_VIM <= 1.08369 )
									ret := 0.884615 // buy
								if( VIP_VIM > 1.08369 )
									ret := 0.294118
		if( VIM > 0.795469 )
			if( VIP <= 1.45102 )
				if( VIP_VIM <= 0.057679 )
					if( VIP_VIM <= 0.055274 )
						if( VIM <= 1.2105 )
							if( VIM <= 1.16262 )
								if( VIP_VIM <= 0.047787 )
									ret := 0.375000
								if( VIP_VIM > 0.047787 )
									ret := 0.636364
							if( VIM > 1.16262 )
								if( VIP_VIM <= 0.031572 )
									ret := -0.086207
								if( VIP_VIM > 0.031572 )
									ret := -0.575000
						if( VIM > 1.2105 )
							if( VIP_VIM <= -0.03125 )
								if( VIM <= 1.25827 )
									ret := -0.885246 // sell
								if( VIM > 1.25827 )
									ret := 0.075969
							if( VIP_VIM > -0.03125 )
								if( VIP_VIM <= -0.020442 )
									ret := 0.620690
								if( VIP_VIM > -0.020442 )
									ret := 0.182870
					if( VIP_VIM > 0.055274 )
						ret := 0.736842 // buy
				if( VIP_VIM > 0.057679 )
					if( VIP <= 1.21478 )
						if( VIP_VIM <= 0.237061 )
							if( VIP <= 1.19648 )
								if( VIP_VIM <= 0.0796 )
									ret := 0.583333
								if( VIP_VIM > 0.0796 )
									ret := -0.372549
							if( VIP > 1.19648 )
								if( VIM <= 0.987355 )
									ret := 0.515152
								if( VIM > 0.987355 )
									ret := -0.100346
						if( VIP_VIM > 0.237061 )
							if( VIP_VIM <= 0.410062 )
								if( VIP <= 1.19555 )
									ret := 0.383436
								if( VIP > 1.19555 )
									ret := 0.134615
							if( VIP_VIM > 0.410062 )
								ret := -0.666667
					if( VIP > 1.21478 )
						if( VIP_VIM <= 0.079577 )
							if( VIM <= 1.15355 )
								ret := -1.000000 // sell
							if( VIM > 1.15355 )
								if( VIM <= 1.24489 )
									ret := 0.052632
								if( VIM > 1.24489 )
									ret := -0.317460
						if( VIP_VIM > 0.079577 )
							if( VIP <= 1.44591 )
								if( VIM <= 1.11903 )
									ret := -0.074605
								if( VIM > 1.11903 )
									ret := 0.050619
							if( VIP > 1.44591 )
								if( VIP_VIM <= 0.20499 )
									ret := -0.900000 // sell
								if( VIP_VIM > 0.20499 )
									ret := -0.378049
			if( VIP > 1.45102 )
				if( VIP <= 1.46989 )
					if( VIP_VIM <= 0.305921 )
						if( VIP_VIM <= 0.093011 )
							if( VIM <= 1.60091 )
								if( VIP <= 1.45941 )
									ret := 0.640000
								if( VIP > 1.45941 )
									ret := 0.250000
							if( VIM > 1.60091 )
								ret := 0.000000
						if( VIP_VIM > 0.093011 )
							if( VIM <= 1.22605 )
								if( VIP_VIM <= 0.271019 )
									ret := -0.545455
								if( VIP_VIM > 0.271019 )
									ret := -0.666667
							if( VIM > 1.22605 )
								if( VIP <= 1.45604 )
									ret := -0.583333
								if( VIP > 1.45604 )
									ret := 0.026316
					if( VIP_VIM > 0.305921 )
						if( VIP <= 1.46971 )
							if( VIP <= 1.46813 )
								if( VIP <= 1.4556 )
									ret := 0.289474
								if( VIP > 1.4556 )
									ret := 0.529412
							if( VIP > 1.46813 )
								ret := 0.000000
						if( VIP > 1.46971 )
							ret := 1.000000 // buy
				if( VIP > 1.46989 )
					if( VIP_VIM <= 0.765103 )
						if( VIP <= 2.55001 )
							if( VIP <= 2.27484 )
								if( VIP_VIM <= 0.303982 )
									ret := -0.041825
								if( VIP_VIM > 0.303982 )
									ret := 0.092058
							if( VIP > 2.27484 )
								if( VIP <= 2.37466 )
									ret := 0.375000
								if( VIP > 2.37466 )
									ret := 0.720000 // buy
						if( VIP > 2.55001 )
							if( VIP_VIM <= 0.043958 )
								if( VIM <= 29.4958 )
									ret := -0.095238
								if( VIM > 29.4958 )
									ret := 0.529412
							if( VIP_VIM > 0.043958 )
								if( VIP <= 18.0748 )
									ret := -0.456522
								if( VIP > 18.0748 )
									ret := -1.000000 // sell
					if( VIP_VIM > 0.765103 )
						if( VIM <= 0.864843 )
							if( VIM <= 0.800332 )
								ret := 1.000000 // buy
							if( VIM > 0.800332 )
								if( VIP_VIM <= 0.954693 )
									ret := 0.644231
								if( VIP_VIM > 0.954693 )
									ret := -0.090909
						if( VIM > 0.864843 )
							if( VIM <= 1.21601 )
								if( VIP_VIM <= 0.877194 )
									ret := 0.371134
								if( VIP_VIM > 0.877194 )
									ret := -0.085714
							if( VIM > 1.21601 )
								ret := -0.166667
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_NVDA_30Min_d418850f(VIP, VIP_VIM, VIM)

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


