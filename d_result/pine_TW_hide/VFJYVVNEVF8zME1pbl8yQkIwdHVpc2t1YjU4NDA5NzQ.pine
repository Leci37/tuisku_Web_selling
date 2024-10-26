//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: TRXUSDT_30Min_2BB0_b5840974 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_30Min_2BB0_b5840974", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_30Min_b5840974(basis, Upper_Band, Lower_Band, bbm, bearPower, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Lower_Band <= 0.059203 )
		if( bbp <= -0.000527 )
			if( Upper_Band <= 0.026334 )
				if( basis <= 0.025426 )
					if( Upper_Band <= 0.026296 )
						if( Upper_Band <= 0.02504 )
							ret := -1.000000 // sell
						if( Upper_Band > 0.02504 )
							if( Upper_Band <= 0.026075 )
								if( Upper_Band <= 0.025263 )
									ret := 0.250000
								if( Upper_Band > 0.025263 )
									ret := 0.000000
							if( Upper_Band > 0.026075 )
								if( Lower_Band <= 0.024537 )
									ret := 1.000000 // buy
								if( Lower_Band > 0.024537 )
									ret := 0.250000
					if( Upper_Band > 0.026296 )
						ret := -1.000000 // sell
				if( basis > 0.025426 )
					if( bullPower <= -0.000331 )
						ret := -0.200000
					if( bullPower > -0.000331 )
						if( basis <= 0.025577 )
							ret := -1.000000 // sell
						if( basis > 0.025577 )
							ret := -0.166667
			if( Upper_Band > 0.026334 )
				if( basis <= 0.066103 )
					if( Lower_Band <= 0.028003 )
						if( Upper_Band <= 0.02918 )
							if( basis <= 0.02831 )
								if( Upper_Band <= 0.02795 )
									ret := 0.107843
								if( Upper_Band > 0.02795 )
									ret := 0.521739
							if( basis > 0.02831 )
								if( basis <= 0.028482 )
									ret := -0.913043 // sell
								if( basis > 0.028482 )
									ret := 0.500000
						if( Upper_Band > 0.02918 )
							if( basis <= 0.028808 )
								if( bearPower <= -0.000481 )
									ret := 0.944444 // buy
								if( bearPower > -0.000481 )
									ret := 0.625000
							if( basis > 0.028808 )
								if( bearPower <= -0.000886 )
									ret := 0.861538 // buy
								if( bearPower > -0.000886 )
									ret := 0.482143
					if( Lower_Band > 0.028003 )
						if( Lower_Band <= 0.02918 )
							if( basis <= 0.029528 )
								if( Lower_Band <= 0.028203 )
									ret := 0.571429
								if( Lower_Band > 0.028203 )
									ret := 0.000000
							if( basis > 0.029528 )
								if( Upper_Band <= 0.031068 )
									ret := -0.867925 // sell
								if( Upper_Band > 0.031068 )
									ret := -0.018692
						if( Lower_Band > 0.02918 )
							if( basis <= 0.031258 )
								if( bbp <= -0.000609 )
									ret := 0.603524
								if( bbp > -0.000609 )
									ret := 0.169492
							if( basis > 0.031258 )
								if( basis <= 0.031751 )
									ret := -0.360465
								if( basis > 0.031751 )
									ret := 0.209904
				if( basis > 0.066103 )
					if( bbp <= -0.00395 )
						ret := -1.000000 // sell
					if( bbp > -0.00395 )
						ret := -0.800000 // sell
		if( bbp > -0.000527 )
			if( Lower_Band <= 0.026029 )
				if( Lower_Band <= 0.025821 )
					if( Lower_Band <= 0.023928 )
						if( bullPower <= 0.000467 )
							if( basis <= 0.023655 )
								if( bbm <= 0.000198 )
									ret := 1.000000 // buy
								if( bbm > 0.000198 )
									ret := 0.750000 // buy
							if( basis > 0.023655 )
								if( Upper_Band <= 0.024564 )
									ret := 0.262295
								if( Upper_Band > 0.024564 )
									ret := 0.825000 // buy
						if( bullPower > 0.000467 )
							ret := -1.000000 // sell
					if( Lower_Band > 0.023928 )
						if( Upper_Band <= 0.024978 )
							if( Lower_Band <= 0.024124 )
								if( bearPower <= -0.000107 )
									ret := 0.625000
								if( bearPower > -0.000107 )
									ret := -0.227273
							if( Lower_Band > 0.024124 )
								if( bbm <= 0.000165 )
									ret := -0.976190 // sell
								if( bbm > 0.000165 )
									ret := -0.250000
						if( Upper_Band > 0.024978 )
							if( basis <= 0.025 )
								if( bbp <= 0.00022 )
									ret := 0.632558
								if( bbp > 0.00022 )
									ret := 0.045455
							if( basis > 0.025 )
								if( bbp <= -0.000139 )
									ret := 0.322857
								if( bbp > -0.000139 )
									ret := 0.097817
				if( Lower_Band > 0.025821 )
					if( Upper_Band <= 0.026421 )
						if( bbm <= 0.000234 )
							if( bbm <= 0.000195 )
								if( bearPower <= -4.1e-05 )
									ret := 0.416667
								if( bearPower > -4.1e-05 )
									ret := -0.250000
							if( bbm > 0.000195 )
								ret := -0.857143 // sell
						if( bbm > 0.000234 )
							if( bbp <= 0.000101 )
								if( Upper_Band <= 0.026334 )
									ret := 1.000000 // buy
								if( Upper_Band > 0.026334 )
									ret := 0.750000 // buy
							if( bbp > 0.000101 )
								ret := 0.000000
					if( Upper_Band > 0.026421 )
						if( bearPower <= -6e-05 )
							if( bullPower <= -0.000153 )
								ret := 0.000000
							if( bullPower > -0.000153 )
								if( Upper_Band <= 0.026744 )
									ret := 0.592593
								if( Upper_Band > 0.026744 )
									ret := 0.835165 // buy
						if( bearPower > -6e-05 )
							if( bbm <= 0.000235 )
								if( Lower_Band <= 0.025976 )
									ret := 0.573529
								if( Lower_Band > 0.025976 )
									ret := -0.136364
							if( bbm > 0.000235 )
								if( Lower_Band <= 0.02598 )
									ret := -0.562500
								if( Lower_Band > 0.02598 )
									ret := 0.636364
			if( Lower_Band > 0.026029 )
				if( basis <= 0.057434 )
					if( bbm <= 0.000133 )
						if( basis <= 0.026346 )
							if( bullPower <= 5.8e-05 )
								if( bullPower <= -2.1e-05 )
									ret := 0.000000
								if( bullPower > -2.1e-05 )
									ret := 0.750000 // buy
							if( bullPower > 5.8e-05 )
								if( bbp <= 0.000211 )
									ret := -0.166667
								if( bbp > 0.000211 )
									ret := 1.000000 // buy
						if( basis > 0.026346 )
							if( Lower_Band <= 0.026436 )
								if( bearPower <= -2.5e-05 )
									ret := -0.240000
								if( bearPower > -2.5e-05 )
									ret := -0.628205
							if( Lower_Band > 0.026436 )
								if( Upper_Band <= 0.027043 )
									ret := 0.278351
								if( Upper_Band > 0.027043 )
									ret := -0.109293
					if( bbm > 0.000133 )
						if( bbp <= 0.001366 )
							if( basis <= 0.036236 )
								if( Upper_Band <= 0.034054 )
									ret := 0.060691
								if( Upper_Band > 0.034054 )
									ret := -0.130376
							if( basis > 0.036236 )
								if( basis <= 0.044674 )
									ret := 0.772152 // buy
								if( basis > 0.044674 )
									ret := 0.115630
						if( bbp > 0.001366 )
							if( Upper_Band <= 0.058526 )
								if( bullPower <= 0.004201 )
									ret := -0.188769
								if( bullPower > 0.004201 )
									ret := -0.800000 // sell
							if( Upper_Band > 0.058526 )
								if( Upper_Band <= 0.061705 )
									ret := 0.471910
								if( Upper_Band > 0.061705 )
									ret := -0.750000 // sell
				if( basis > 0.057434 )
					if( basis <= 0.059262 )
						if( Upper_Band <= 0.058467 )
							if( bbp <= 0.000336 )
								if( bbp <= 7.3e-05 )
									ret := 0.875000 // buy
								if( bbp > 7.3e-05 )
									ret := 0.190476
							if( bbp > 0.000336 )
								if( bearPower <= 0.00016 )
									ret := 0.974359 // buy
								if( bearPower > 0.00016 )
									ret := 0.750000 // buy
						if( Upper_Band > 0.058467 )
							if( basis <= 0.058254 )
								if( basis <= 0.058052 )
									ret := 0.392157
								if( basis > 0.058052 )
									ret := -0.072000
							if( basis > 0.058254 )
								if( Lower_Band <= 0.058268 )
									ret := 0.502924
								if( Lower_Band > 0.058268 )
									ret := 0.245810
					if( basis > 0.059262 )
						if( basis <= 0.062415 )
							if( basis <= 0.061002 )
								if( Upper_Band <= 0.064776 )
									ret := 0.064240
								if( Upper_Band > 0.064776 )
									ret := 0.630435
							if( basis > 0.061002 )
								if( Upper_Band <= 0.065243 )
									ret := -0.759259 // sell
								if( Upper_Band > 0.065243 )
									ret := 0.070175
						if( basis > 0.062415 )
							if( Upper_Band <= 0.07023 )
								if( Lower_Band <= 0.058408 )
									ret := 0.960000 // buy
								if( Lower_Band > 0.058408 )
									ret := 0.000000
							if( Upper_Band > 0.07023 )
								if( basis <= 0.066429 )
									ret := -0.500000
								if( basis > 0.066429 )
									ret := 0.000000
	if( Lower_Band > 0.059203 )
		if( bullPower <= 0.004797 )
			if( bbm <= 0.000434 )
				if( Lower_Band <= 0.064204 )
					if( bbm <= 0.000328 )
						if( basis <= 0.065005 )
							if( bearPower <= -0.00092 )
								if( basis <= 0.063216 )
									ret := -0.100000
								if( basis > 0.063216 )
									ret := -0.869565 // sell
							if( bearPower > -0.00092 )
								if( Upper_Band <= 0.066238 )
									ret := 0.016813
								if( Upper_Band > 0.066238 )
									ret := 0.488889
						if( basis > 0.065005 )
							if( bullPower <= 0.000467 )
								if( Lower_Band <= 0.063782 )
									ret := -0.142857
								if( Lower_Band > 0.063782 )
									ret := 0.655738
							if( bullPower > 0.000467 )
								if( bbm <= 0.000318 )
									ret := 0.142857
								if( bbm > 0.000318 )
									ret := -0.750000 // sell
					if( bbm > 0.000328 )
						if( basis <= 0.062925 )
							if( Upper_Band <= 0.063733 )
								if( bearPower <= 3.4e-05 )
									ret := 0.003478
								if( bearPower > 3.4e-05 )
									ret := 0.265537
							if( Upper_Band > 0.063733 )
								if( bearPower <= -0.000719 )
									ret := 0.318182
								if( bearPower > -0.000719 )
									ret := -0.545455
						if( basis > 0.062925 )
							if( basis <= 0.063487 )
								if( bearPower <= -0.000467 )
									ret := -0.131148
								if( bearPower > -0.000467 )
									ret := 0.507538
							if( basis > 0.063487 )
								if( Upper_Band <= 0.064052 )
									ret := -0.437500
								if( Upper_Band > 0.064052 )
									ret := 0.128205
				if( Lower_Band > 0.064204 )
					if( bbp <= 0.00055 )
						if( Upper_Band <= 0.067942 )
							if( bbp <= -0.00058 )
								if( basis <= 0.066881 )
									ret := 0.316667
								if( basis > 0.066881 )
									ret := -0.478261
							if( bbp > -0.00058 )
								if( basis <= 0.067184 )
									ret := -0.087455
								if( basis > 0.067184 )
									ret := -0.346863
						if( Upper_Band > 0.067942 )
							if( basis <= 0.068197 )
								if( Lower_Band <= 0.067276 )
									ret := 0.153846
								if( Lower_Band > 0.067276 )
									ret := 0.448819
							if( basis > 0.068197 )
								if( basis <= 0.068386 )
									ret := -0.392638
								if( basis > 0.068386 )
									ret := -0.020692
					if( bbp > 0.00055 )
						if( Upper_Band <= 0.070847 )
							if( Lower_Band <= 0.064826 )
								if( Upper_Band <= 0.066491 )
									ret := -0.063158
								if( Upper_Band > 0.066491 )
									ret := -0.618182
							if( Lower_Band > 0.064826 )
								if( Upper_Band <= 0.067208 )
									ret := 0.012658
								if( Upper_Band > 0.067208 )
									ret := 0.303957
						if( Upper_Band > 0.070847 )
							if( Lower_Band <= 0.118735 )
								if( basis <= 0.119562 )
									ret := -0.003571
								if( basis > 0.119562 )
									ret := -0.605263
							if( Lower_Band > 0.118735 )
								if( Upper_Band <= 0.128021 )
									ret := 0.203390
								if( Upper_Band > 0.128021 )
									ret := 0.027539
			if( bbm > 0.000434 )
				if( Lower_Band <= 0.102405 )
					if( basis <= 0.104065 )
						if( bearPower <= 0.000298 )
							if( Lower_Band <= 0.060401 )
								if( bearPower <= -0.000907 )
									ret := 0.127753
								if( bearPower > -0.000907 )
									ret := -0.242739
							if( Lower_Band > 0.060401 )
								if( basis <= 0.064 )
									ret := 0.226601
								if( basis > 0.064 )
									ret := 0.099820
						if( bearPower > 0.000298 )
							if( bbm <= 0.001954 )
								if( Lower_Band <= 0.06315 )
									ret := -0.214689
								if( Lower_Band > 0.06315 )
									ret := 0.012135
							if( bbm > 0.001954 )
								if( Upper_Band <= 0.108182 )
									ret := -0.438202
								if( Upper_Band > 0.108182 )
									ret := 1.000000 // buy
					if( basis > 0.104065 )
						if( Lower_Band <= 0.096656 )
							if( bbm <= 0.002432 )
								ret := -1.000000 // sell
							if( bbm > 0.002432 )
								if( Upper_Band <= 0.123424 )
									ret := 0.142857
								if( Upper_Band > 0.123424 )
									ret := -0.727273 // sell
						if( Lower_Band > 0.096656 )
							if( Lower_Band <= 0.101985 )
								if( basis <= 0.105394 )
									ret := 0.800000 // buy
								if( basis > 0.105394 )
									ret := 0.518182
							if( Lower_Band > 0.101985 )
								if( Upper_Band <= 0.106268 )
									ret := -0.400000
								if( Upper_Band > 0.106268 )
									ret := 0.500000
				if( Lower_Band > 0.102405 )
					if( bullPower <= 0.000589 )
						if( bbp <= -0.004571 )
							if( basis <= 0.153965 )
								if( bbm <= 0.00417 )
									ret := 0.133581
								if( bbm > 0.00417 )
									ret := 0.439490
							if( basis > 0.153965 )
								if( basis <= 0.159436 )
									ret := -0.676923
								if( basis > 0.159436 )
									ret := 0.093750
						if( bbp > -0.004571 )
							if( Upper_Band <= 0.161796 )
								if( basis <= 0.149845 )
									ret := -0.099137
								if( basis > 0.149845 )
									ret := 0.081425
							if( Upper_Band > 0.161796 )
								if( bbm <= 0.000826 )
									ret := -0.197368
								if( bbm > 0.000826 )
									ret := -0.617978
					if( bullPower > 0.000589 )
						if( basis <= 0.168195 )
							if( Lower_Band <= 0.133495 )
								if( Lower_Band <= 0.128685 )
									ret := 0.074790
								if( Lower_Band > 0.128685 )
									ret := -0.382883
							if( Lower_Band > 0.133495 )
								if( basis <= 0.160027 )
									ret := 0.334184
								if( basis > 0.160027 )
									ret := -0.175439
						if( basis > 0.168195 )
							ret := -1.000000 // sell
		if( bullPower > 0.004797 )
			if( bbp <= 0.005016 )
				if( Upper_Band <= 0.138244 )
					ret := 0.500000
				if( Upper_Band > 0.138244 )
					ret := 1.000000 // buy
			if( bbp > 0.005016 )
				if( basis <= 0.073777 )
					ret := 1.000000 // buy
				if( basis > 0.073777 )
					if( Upper_Band <= 0.116444 )
						if( Lower_Band <= 0.067634 )
							if( Upper_Band <= 0.08459 )
								ret := 0.000000
							if( Upper_Band > 0.08459 )
								ret := 1.000000 // buy
						if( Lower_Band > 0.067634 )
							if( basis <= 0.095032 )
								if( Lower_Band <= 0.082687 )
									ret := -0.905660 // sell
								if( Lower_Band > 0.082687 )
									ret := 1.000000 // buy
							if( basis > 0.095032 )
								if( basis <= 0.103389 )
									ret := -1.000000 // sell
								if( basis > 0.103389 )
									ret := -0.750000 // sell
					if( Upper_Band > 0.116444 )
						if( basis <= 0.125065 )
							if( bearPower <= 0.002919 )
								if( Lower_Band <= 0.113054 )
									ret := 0.166667
								if( Lower_Band > 0.113054 )
									ret := -0.909091 // sell
							if( bearPower > 0.002919 )
								if( bbp <= 0.012752 )
									ret := 0.657895
								if( bbp > 0.012752 )
									ret := -0.250000
						if( basis > 0.125065 )
							if( bearPower <= 0.002689 )
								if( bullPower <= 0.005201 )
									ret := -0.814815 // sell
								if( bullPower > 0.005201 )
									ret := -0.071429
							if( bearPower > 0.002689 )
								if( Lower_Band <= 0.152583 )
									ret := -0.872340 // sell
								if( Lower_Band > 0.152583 )
									ret := -0.250000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bollinger_Bands 
//@version=5
//indicator shorttitle="BB", title="Bollinger Bands", overlay=true, timeframe="", timeframe_gaps=true)
length_BB = input.int(20, minval=1)
maType = input.string("SMA", "Basis MA Type", options = ["SMA", "EMA", "SMMA (RMA)", "WMA", "VWMA"])
src = input(close, title="Source")
mult = input.float(2.0, minval=0.001, maxval=50, title="StdDev")

ma(source, length_BB, _type) =>
    switch _type
        "SMA" => ta.sma(source, length_BB)
        "EMA" => ta.ema(source, length_BB)
        "SMMA (RMA)" => ta.rma(source, length_BB)
        "WMA" => ta.wma(source, length_BB)
        "VWMA" => ta.vwma(source, length_BB)

basis = ma(src, length_BB, maType)
dev = mult * ta.stdev(src, length_BB)
Upper_Band = basis + dev
Lower_Band = basis - dev
offset = input.int(0, "Offset", minval = -500, maxval = 500, display = display.data_window)
plot(basis, "Basis", color=#2962FF, offset = offset)
p1 = plot(Upper_Band, "Upper", color=#F23645, offset = offset)
p2 = plot(Lower_Band, "Lower", color=#089981, offset = offset)
fill(p1, p2, title = "Background", color=color.rgb(33, 150, 243, 95))

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0

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
float op_operation = decision_tree_0_TRXUSDT_30Min_b5840974(basis, Upper_Band, Lower_Band, bbm, bearPower, bbp, bullPower, BBPower_Color)

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


