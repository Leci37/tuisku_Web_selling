//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Vortex_Indicator
// ID_model: DOTUSDT_30Min_2CV0_390c4cad Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_30Min_2CV0_390c4cad", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_30Min_390c4cad(mf, ad_mf, ad, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ad <= -183120 )
		if( VIP <= 1.28413 )
			if( mf <= -0.285163 )
				if( VIP <= 0.571279 )
					if( VIP <= 0.560167 )
						if( VIP_VIM <= -0.758282 )
							ret := 0.222222
						if( VIP_VIM > -0.758282 )
							ret := 0.888889 // buy
					if( VIP > 0.560167 )
						ret := 0.888889 // buy
				if( VIP > 0.571279 )
					if( VIM <= 1.03744 )
						ret := -0.764706 // sell
					if( VIM > 1.03744 )
						if( VIM <= 1.15987 )
							if( mf <= -0.327711 )
								if( VIP_VIM <= -0.366451 )
									ret := 0.727273 // buy
								if( VIP_VIM > -0.366451 )
									ret := 0.333333
							if( mf > -0.327711 )
								if( VIM <= 1.13031 )
									ret := -0.500000
								if( VIM > 1.13031 )
									ret := 0.250000
						if( VIM > 1.15987 )
							if( ad_mf <= -540504 )
								if( VIM <= 1.21533 )
									ret := -0.111111
								if( VIM > 1.21533 )
									ret := 0.666667
							if( ad_mf > -540504 )
								if( mf <= -0.289941 )
									ret := -0.453608
								if( mf > -0.289941 )
									ret := -1.000000 // sell
			if( mf > -0.285163 )
				if( VIM <= 0.845562 )
					if( VIP <= 1.00578 )
						ret := 1.000000 // buy
					if( VIP > 1.00578 )
						if( mf <= 0.222313 )
							if( VIP_VIM <= 0.557414 )
								if( VIP <= 1.16867 )
									ret := 0.365967
								if( VIP > 1.16867 )
									ret := 0.181063
							if( VIP_VIM > 0.557414 )
								if( ad <= -209368 )
									ret := 0.724138 // buy
								if( ad > -209368 )
									ret := 0.222222
						if( mf > 0.222313 )
							if( VIP <= 1.15455 )
								ret := -0.352941
							if( VIP > 1.15455 )
								if( ad <= -232460 )
									ret := 0.219178
								if( ad > -232460 )
									ret := -0.333333
				if( VIM > 0.845562 )
					if( ad <= -495474 )
						if( VIP <= 0.770179 )
							if( VIM <= 1.25608 )
								if( mf <= -0.167122 )
									ret := 0.731343 // buy
								if( mf > -0.167122 )
									ret := 0.913580 // buy
							if( VIM > 1.25608 )
								ret := 0.333333
						if( VIP > 0.770179 )
							if( VIP <= 0.841822 )
								if( mf <= -0.234193 )
									ret := -0.178571
								if( mf > -0.234193 )
									ret := 0.612676
							if( VIP > 0.841822 )
								if( ad_mf <= -1.38527e+06 )
									ret := -0.473684
								if( ad_mf > -1.38527e+06 )
									ret := 0.295933
					if( ad > -495474 )
						if( ad <= -199512 )
							if( ad <= -492666 )
								ret := -1.000000 // sell
							if( ad > -492666 )
								if( ad <= -485692 )
									ret := 0.804878 // buy
								if( ad > -485692 )
									ret := 0.068205
						if( ad > -199512 )
							if( ad <= -192399 )
								if( VIM <= 0.996916 )
									ret := 0.179775
								if( VIM > 0.996916 )
									ret := 0.671296
							if( ad > -192399 )
								if( mf <= 0.124835 )
									ret := 0.181223
								if( mf > 0.124835 )
									ret := -0.307692
		if( VIP > 1.28413 )
			if( VIM <= 0.641073 )
				if( VIP <= 1.31377 )
					ret := -0.777778 // sell
				if( VIP > 1.31377 )
					if( ad <= -789158 )
						ret := 0.777778 // buy
					if( ad > -789158 )
						if( VIP_VIM <= 0.69659 )
							ret := 0.583333
						if( VIP_VIM > 0.69659 )
							if( mf <= 0.171632 )
								ret := -0.250000
							if( mf > 0.171632 )
								if( ad_mf <= -420707 )
									ret := -0.222222
								if( ad_mf > -420707 )
									ret := 0.145455
			if( VIM > 0.641073 )
				if( ad_mf <= -491062 )
					if( ad_mf <= -590947 )
						ret := -0.700000 // sell
					if( ad_mf > -590947 )
						ret := -1.000000 // sell
				if( ad_mf > -491062 )
					if( VIM <= 0.675726 )
						if( ad <= -209326 )
							if( VIM <= 0.653972 )
								ret := -0.625000
							if( VIM > 0.653972 )
								ret := 0.000000
						if( ad > -209326 )
							ret := -0.909091 // sell
					if( VIM > 0.675726 )
						if( ad_mf <= -232574 )
							if( mf <= 0.124983 )
								ret := 0.400000
							if( mf > 0.124983 )
								ret := 0.666667
						if( ad_mf > -232574 )
							if( VIP_VIM <= 0.588835 )
								ret := -0.500000
							if( VIP_VIM > 0.588835 )
								ret := 0.058824
	if( ad > -183120 )
		if( ad_mf <= 53436.2 )
			if( ad <= 45455.7 )
				if( mf <= 0.009488 )
					if( VIM <= 1.10155 )
						if( ad_mf <= -164731 )
							if( ad_mf <= -168270 )
								if( ad_mf <= -173226 )
									ret := -0.212000
								if( ad_mf > -173226 )
									ret := 0.239437
							if( ad_mf > -168270 )
								if( VIP <= 0.923907 )
									ret := -0.333333
								if( VIP > 0.923907 )
									ret := -0.851351 // sell
						if( ad_mf > -164731 )
							if( VIP_VIM <= 0.018543 )
								if( VIP <= 0.925868 )
									ret := 0.009363
								if( VIP > 0.925868 )
									ret := -0.058149
							if( VIP_VIM > 0.018543 )
								if( VIP_VIM <= 0.019014 )
									ret := 0.625000
								if( VIP_VIM > 0.019014 )
									ret := -0.006305
					if( VIM > 1.10155 )
						if( VIM <= 1.12043 )
							if( ad_mf <= -176755 )
								ret := 0.866667 // buy
							if( ad_mf > -176755 )
								if( ad_mf <= 39502 )
									ret := 0.096045
								if( ad_mf > 39502 )
									ret := -0.313725
						if( VIM > 1.12043 )
							if( ad_mf <= 44330.9 )
								if( ad_mf <= -55635.7 )
									ret := 0.074947
								if( ad_mf > -55635.7 )
									ret := -0.032192
							if( ad_mf > 44330.9 )
								if( VIP_VIM <= -0.368684 )
									ret := -0.800000 // sell
								if( VIP_VIM > -0.368684 )
									ret := -0.470588
				if( mf > 0.009488 )
					if( ad_mf <= -33369.4 )
						if( ad <= -35036.8 )
							if( VIP <= 0.784757 )
								if( ad_mf <= -63976.1 )
									ret := 0.580000
								if( ad_mf > -63976.1 )
									ret := 0.080000
							if( VIP > 0.784757 )
								if( VIP <= 1.06934 )
									ret := 0.058935
								if( VIP > 1.06934 )
									ret := 0.000171
						if( ad > -35036.8 )
							if( VIP_VIM <= -0.018825 )
								if( VIM <= 1.0498 )
									ret := -0.363636
								if( VIM > 1.0498 )
									ret := 0.255319
							if( VIP_VIM > -0.018825 )
								if( mf <= 0.146323 )
									ret := 0.640523
								if( mf > 0.146323 )
									ret := 0.190476
					if( ad_mf > -33369.4 )
						if( VIM <= 0.90747 )
							if( ad <= 39552.9 )
								if( VIP_VIM <= 0.107051 )
									ret := -0.642857
								if( VIP_VIM > 0.107051 )
									ret := 0.025425
							if( ad > 39552.9 )
								if( ad_mf <= 44955.4 )
									ret := 0.282116
								if( ad_mf > 44955.4 )
									ret := -0.102564
						if( VIM > 0.90747 )
							if( VIP <= 1.02102 )
								if( mf <= 0.00972 )
									ret := 0.625000
								if( mf > 0.00972 )
									ret := 0.009301
							if( VIP > 1.02102 )
								if( VIP_VIM <= 0.244866 )
									ret := -0.057553
								if( VIP_VIM > 0.244866 )
									ret := -0.345455
			if( ad > 45455.7 )
				if( ad_mf <= 45593.9 )
					if( mf <= -0.061975 )
						ret := 0.400000
					if( mf > -0.061975 )
						if( VIM <= 1.08015 )
							ret := 0.750000 // buy
						if( VIM > 1.08015 )
							ret := 0.800000 // buy
				if( ad_mf > 45593.9 )
					if( VIP_VIM <= 0.024452 )
						if( mf <= -0.194123 )
							if( VIM <= 1.26179 )
								if( ad_mf <= 48897.5 )
									ret := 0.861111 // buy
								if( ad_mf > 48897.5 )
									ret := 0.423077
							if( VIM > 1.26179 )
								ret := 0.142857
						if( mf > -0.194123 )
							if( VIM <= 1.16557 )
								if( ad <= 47197.8 )
									ret := -0.054393
								if( ad > 47197.8 )
									ret := 0.185057
							if( VIM > 1.16557 )
								if( ad_mf <= 47819.3 )
									ret := 0.179104
								if( ad_mf > 47819.3 )
									ret := -0.098958
					if( VIP_VIM > 0.024452 )
						if( ad <= 52476.8 )
							if( ad_mf <= 52266.1 )
								if( mf <= -0.006735 )
									ret := -0.178571
								if( mf > -0.006735 )
									ret := 0.070913
							if( ad_mf > 52266.1 )
								if( VIP <= 1.09388 )
									ret := 0.500000
								if( VIP > 1.09388 )
									ret := 0.774194 // buy
						if( ad > 52476.8 )
							if( ad_mf <= 53179.5 )
								if( VIP_VIM <= 0.31532 )
									ret := -0.657534
								if( VIP_VIM > 0.31532 )
									ret := -0.275862
							if( ad_mf > 53179.5 )
								if( VIP_VIM <= 0.134609 )
									ret := 0.461538
								if( VIP_VIM > 0.134609 )
									ret := 0.700000 // buy
		if( ad_mf > 53436.2 )
			if( VIP_VIM <= -0.535457 )
				if( mf <= -0.019684 )
					if( ad <= 246994 )
						if( VIM <= 1.29828 )
							if( VIP <= 0.68879 )
								if( VIP <= 0.679678 )
									ret := -0.169492
								if( VIP > 0.679678 )
									ret := 0.354839
							if( VIP > 0.68879 )
								if( VIM <= 1.2612 )
									ret := -0.431818
								if( VIM > 1.2612 )
									ret := -0.160305
						if( VIM > 1.29828 )
							if( ad_mf <= 109938 )
								if( VIP <= 0.662782 )
									ret := 0.136364
								if( VIP > 0.662782 )
									ret := -0.263158
							if( ad_mf > 109938 )
								if( mf <= -0.132607 )
									ret := 0.460317
								if( mf > -0.132607 )
									ret := 0.026316
					if( ad > 246994 )
						if( ad <= 451874 )
							if( VIM <= 1.26671 )
								ret := -1.000000 // sell
							if( VIM > 1.26671 )
								if( VIP <= 0.622688 )
									ret := -0.883721 // sell
								if( VIP > 0.622688 )
									ret := -0.388889
						if( ad > 451874 )
							if( VIM <= 1.25037 )
								ret := -0.142857
							if( VIM > 1.25037 )
								if( VIP_VIM <= -0.605253 )
									ret := 0.205128
								if( VIP_VIM > -0.605253 )
									ret := 0.692308
				if( mf > -0.019684 )
					if( VIM <= 1.31417 )
						if( ad <= 693019 )
							if( mf <= 0.025429 )
								if( ad <= 184343 )
									ret := -0.291667
								if( ad > 184343 )
									ret := -0.741379 // sell
							if( mf > 0.025429 )
								if( ad <= 437274 )
									ret := -0.441176
								if( ad > 437274 )
									ret := 0.222222
						if( ad > 693019 )
							if( ad_mf <= 1.50961e+06 )
								ret := 0.333333
							if( ad_mf > 1.50961e+06 )
								ret := -0.384615
					if( VIM > 1.31417 )
						if( ad <= 451857 )
							if( ad_mf <= 186388 )
								if( ad <= 63852.9 )
									ret := -0.571429
								if( ad > 63852.9 )
									ret := -0.058824
							if( ad_mf > 186388 )
								ret := -0.909091 // sell
						if( ad > 451857 )
							ret := 0.818182 // buy
			if( VIP_VIM > -0.535457 )
				if( ad <= 579740 )
					if( mf <= -0.253619 )
						if( VIM <= 1.14465 )
							if( VIP_VIM <= -0.195617 )
								ret := 0.333333
							if( VIP_VIM > -0.195617 )
								ret := 0.875000 // buy
						if( VIM > 1.14465 )
							if( ad <= 66820.1 )
								ret := -0.727273 // sell
							if( ad > 66820.1 )
								if( ad_mf <= 102358 )
									ret := 0.052632
								if( ad_mf > 102358 )
									ret := 0.611111
					if( mf > -0.253619 )
						if( ad <= 500140 )
							if( VIP <= 1.00401 )
								if( mf <= -0.169456 )
									ret := -0.237778
								if( mf > -0.169456 )
									ret := -0.021453
							if( VIP > 1.00401 )
								if( VIP <= 1.26968 )
									ret := -0.064219
								if( VIP > 1.26968 )
									ret := -0.157556
						if( ad > 500140 )
							if( VIM <= 0.802766 )
								if( ad_mf <= 560628 )
									ret := 0.043956
								if( ad_mf > 560628 )
									ret := 1.000000 // buy
							if( VIM > 0.802766 )
								if( VIP <= 0.760229 )
									ret := 0.800000 // buy
								if( VIP > 0.760229 )
									ret := -0.513158
				if( ad > 579740 )
					if( VIM <= 0.989277 )
						if( ad <= 755207 )
							if( VIM <= 0.669335 )
								if( ad <= 717559 )
									ret := 0.846154 // buy
								if( ad > 717559 )
									ret := 1.000000 // buy
							if( VIM > 0.669335 )
								if( ad_mf <= 680523 )
									ret := -0.171875
								if( ad_mf > 680523 )
									ret := 0.571429
						if( ad > 755207 )
							if( VIP <= 1.13414 )
								if( VIP <= 0.991224 )
									ret := -0.454545
								if( VIP > 0.991224 )
									ret := 0.154472
							if( VIP > 1.13414 )
								if( ad <= 774093 )
									ret := -0.862069 // sell
								if( ad > 774093 )
									ret := -0.478261
					if( VIM > 0.989277 )
						if( VIP_VIM <= -0.035273 )
							if( ad <= 626728 )
								if( ad_mf <= 602563 )
									ret := 0.153846
								if( ad_mf > 602563 )
									ret := 0.977778 // buy
							if( ad > 626728 )
								if( VIM <= 1.12701 )
									ret := 0.070896
								if( VIM > 1.12701 )
									ret := 0.444954
						if( VIP_VIM > -0.035273 )
							if( ad <= 829075 )
								ret := 1.000000 // buy
							if( ad > 829075 )
								ret := 0.777778 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_DOTUSDT_30Min_390c4cad(mf, ad_mf, ad, VIP, VIP_VIM, VIM)

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


