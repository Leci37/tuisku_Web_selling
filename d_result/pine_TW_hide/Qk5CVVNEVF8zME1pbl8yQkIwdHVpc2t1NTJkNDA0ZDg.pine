//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: BNBUSDT_30Min_2BB0_52d404d8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_30Min_2BB0_52d404d8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_30Min_52d404d8(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Lower_Band <= 581.332 )
		if( Lower_Band <= 205.206 )
			if( bbp <= -2.4843 )
				if( Upper_Band <= 262.659 )
					if( basis <= 133.155 )
						if( basis <= 28.4362 )
							ret := 0.000000
						if( basis > 28.4362 )
							if( Lower_Band <= 129.025 )
								if( bbm <= 2.3428 )
									ret := 0.730337 // buy
								if( bbm > 2.3428 )
									ret := 0.906667 // buy
							if( Lower_Band > 129.025 )
								ret := 0.000000
					if( basis > 133.155 )
						if( bbm <= 3.41167 )
							if( bbm <= 3.11432 )
								if( Upper_Band <= 137.068 )
									ret := -0.857143 // sell
								if( Upper_Band > 137.068 )
									ret := 0.203704
							if( bbm > 3.11432 )
								if( bbp <= -7.18732 )
									ret := -1.000000 // sell
								if( bbp > -7.18732 )
									ret := -0.750000 // sell
						if( bbm > 3.41167 )
							if( basis <= 134.006 )
								if( bearPower <= -7.58295 )
									ret := 0.250000
								if( bearPower > -7.58295 )
									ret := -1.000000 // sell
							if( basis > 134.006 )
								if( bullPower <= 0.654116 )
									ret := 0.879121 // buy
								if( bullPower > 0.654116 )
									ret := 0.500000
				if( Upper_Band > 262.659 )
					if( bearPower <= -18.3887 )
						ret := -0.500000
					if( bearPower > -18.3887 )
						ret := -1.000000 // sell
			if( bbp > -2.4843 )
				if( Lower_Band <= 49.4139 )
					if( Lower_Band <= 43.7088 )
						if( basis <= 43.924 )
							if( bullPower <= 0.392628 )
								if( Lower_Band <= 26.9416 )
									ret := 0.229648
								if( Lower_Band > 26.9416 )
									ret := 0.075117
							if( bullPower > 0.392628 )
								if( bbm <= 0.3275 )
									ret := 0.183838
								if( bbm > 0.3275 )
									ret := -0.076429
						if( basis > 43.924 )
							if( bbp <= 3.08118 )
								if( basis <= 45.3072 )
									ret := 0.671756
								if( basis > 45.3072 )
									ret := -0.500000
							if( bbp > 3.08118 )
								ret := -1.000000 // sell
					if( Lower_Band > 43.7088 )
						if( basis <= 44.5002 )
							ret := -1.000000 // sell
						if( basis > 44.5002 )
							if( bbm <= 0.678161 )
								if( Upper_Band <= 45.0673 )
									ret := 1.000000 // buy
								if( Upper_Band > 45.0673 )
									ret := -0.020979
							if( bbm > 0.678161 )
								if( basis <= 46.2383 )
									ret := -0.900000 // sell
								if( basis > 46.2383 )
									ret := -0.250000
				if( Lower_Band > 49.4139 )
					if( Upper_Band <= 128.972 )
						if( Lower_Band <= 71.85 )
							if( basis <= 69.2354 )
								if( bullPower <= 4.64529 )
									ret := 0.529070
								if( bullPower > 4.64529 )
									ret := -1.000000 // sell
							if( basis > 69.2354 )
								if( Lower_Band <= 70.4388 )
									ret := -0.456311
								if( Lower_Band > 70.4388 )
									ret := 0.420000
						if( Lower_Band > 71.85 )
							if( bbm <= 2.47425 )
								if( bearPower <= 0.180023 )
									ret := 0.920000 // buy
								if( bearPower > 0.180023 )
									ret := 1.000000 // buy
							if( bbm > 2.47425 )
								if( basis <= 91.5104 )
									ret := 0.055556
								if( basis > 91.5104 )
									ret := 0.726027 // buy
					if( Upper_Band > 128.972 )
						if( basis <= 126.738 )
							if( basis <= 119.765 )
								ret := 1.000000 // buy
							if( basis > 119.765 )
								if( bearPower <= -2.51032 )
									ret := 0.500000
								if( bearPower > -2.51032 )
									ret := -0.803030 // sell
						if( basis > 126.738 )
							if( basis <= 129.714 )
								if( Lower_Band <= 117.783 )
									ret := -0.750000 // sell
								if( Lower_Band > 117.783 )
									ret := 0.809524 // buy
							if( basis > 129.714 )
								if( basis <= 136.072 )
									ret := -0.158621
								if( basis > 136.072 )
									ret := 0.239938
		if( Lower_Band > 205.206 )
			if( bbp <= -22.6779 )
				if( Lower_Band <= 335.772 )
					if( Lower_Band <= 224.17 )
						if( bbm <= 17.0533 )
							if( Upper_Band <= 291.664 )
								ret := -0.750000 // sell
							if( Upper_Band > 291.664 )
								ret := -1.000000 // sell
						if( bbm > 17.0533 )
							ret := 0.666667
					if( Lower_Band > 224.17 )
						if( bbm <= 20.5507 )
							if( basis <= 365.88 )
								if( Upper_Band <= 336.606 )
									ret := 0.333333
								if( Upper_Band > 336.606 )
									ret := 0.709402 // buy
							if( basis > 365.88 )
								ret := -1.000000 // sell
						if( bbm > 20.5507 )
							if( Upper_Band <= 346.135 )
								if( bbp <= -35.8619 )
									ret := 0.900000 // buy
								if( bbp > -35.8619 )
									ret := 1.000000 // buy
							if( Upper_Band > 346.135 )
								if( bbm <= 28.7398 )
									ret := 0.533333
								if( bbm > 28.7398 )
									ret := 1.000000 // buy
				if( Lower_Band > 335.772 )
					if( Upper_Band <= 417.577 )
						if( bearPower <= -16.5623 )
							if( bearPower <= -31.5987 )
								ret := -1.000000 // sell
							if( bearPower > -31.5987 )
								if( bearPower <= -23.3009 )
									ret := 0.461538
								if( bearPower > -23.3009 )
									ret := -0.577465
						if( bearPower > -16.5623 )
							if( bullPower <= -10.0931 )
								if( Upper_Band <= 412.607 )
									ret := 0.250000
								if( Upper_Band > 412.607 )
									ret := -1.000000 // sell
							if( bullPower > -10.0931 )
								if( Upper_Band <= 385.221 )
									ret := 0.000000
								if( Upper_Band > 385.221 )
									ret := 1.000000 // buy
					if( Upper_Band > 417.577 )
						if( Upper_Band <= 472.071 )
							if( bbm <= 19.3533 )
								if( Lower_Band <= 397.671 )
									ret := 0.600000
								if( Lower_Band > 397.671 )
									ret := 0.975610 // buy
							if( bbm > 19.3533 )
								if( bbm <= 24.4642 )
									ret := 0.000000
								if( bbm > 24.4642 )
									ret := -0.400000
						if( Upper_Band > 472.071 )
							if( Upper_Band <= 539.429 )
								if( bullPower <= -7.42331 )
									ret := -0.411043
								if( bullPower > -7.42331 )
									ret := 0.180556
							if( Upper_Band > 539.429 )
								if( Lower_Band <= 562.23 )
									ret := 0.444043
								if( Lower_Band > 562.23 )
									ret := -0.154930
			if( bbp > -22.6779 )
				if( Upper_Band <= 609.31 )
					if( bbm <= 0.924707 )
						if( bearPower <= -0.250157 )
							if( Upper_Band <= 213.146 )
								if( basis <= 207.285 )
									ret := 0.333333
								if( basis > 207.285 )
									ret := -0.210256
							if( Upper_Band > 213.146 )
								if( Lower_Band <= 234.948 )
									ret := 0.027301
								if( Lower_Band > 234.948 )
									ret := -0.049230
						if( bearPower > -0.250157 )
							if( Upper_Band <= 244.412 )
								if( Lower_Band <= 222.232 )
									ret := 0.038544
								if( Lower_Band > 222.232 )
									ret := -0.063170
							if( Upper_Band > 244.412 )
								if( Lower_Band <= 268.045 )
									ret := 0.123726
								if( Lower_Band > 268.045 )
									ret := 0.028409
					if( bbm > 0.924707 )
						if( bullPower <= 32.5684 )
							if( Lower_Band <= 578.898 )
								if( bearPower <= -3.67816 )
									ret := 0.077888
								if( bearPower > -3.67816 )
									ret := 0.042566
							if( Lower_Band > 578.898 )
								if( bearPower <= -1.19965 )
									ret := -0.034483
								if( bearPower > -1.19965 )
									ret := 0.426778
						if( bullPower > 32.5684 )
							if( bearPower <= 12.241 )
								ret := -0.800000 // sell
							if( bearPower > 12.241 )
								ret := -1.000000 // sell
				if( Upper_Band > 609.31 )
					if( bearPower <= -5.48729 )
						if( Lower_Band <= 556.321 )
							if( bullPower <= -3.98715 )
								ret := -0.571429
							if( bullPower > -3.98715 )
								if( bullPower <= -1.61137 )
									ret := 1.000000 // buy
								if( bullPower > -1.61137 )
									ret := 0.705882 // buy
						if( Lower_Band > 556.321 )
							if( basis <= 589.493 )
								if( basis <= 588.459 )
									ret := -0.882353 // sell
								if( basis > 588.459 )
									ret := -0.454545
							if( basis > 589.493 )
								if( bullPower <= 0.641647 )
									ret := 0.329412
								if( bullPower > 0.641647 )
									ret := -0.500000
					if( bearPower > -5.48729 )
						if( basis <= 592.25 )
							if( bbm <= 8.18353 )
								if( bearPower <= 4.53236 )
									ret := -0.694444
								if( bearPower > 4.53236 )
									ret := 0.000000
							if( bbm > 8.18353 )
								if( basis <= 579.894 )
									ret := -0.700000 // sell
								if( basis > 579.894 )
									ret := -0.952381 // sell
						if( basis > 592.25 )
							if( basis <= 595.749 )
								if( bbm <= 5.80971 )
									ret := -0.111111
								if( bbm > 5.80971 )
									ret := 0.689655
							if( basis > 595.749 )
								if( bullPower <= 8.97347 )
									ret := -0.364706
								if( bullPower > 8.97347 )
									ret := -0.848485 // sell
	if( Lower_Band > 581.332 )
		if( bbp <= -33.0241 )
			if( Upper_Band <= 669.114 )
				if( Lower_Band <= 585.296 )
					if( bearPower <= -27.819 )
						ret := 1.000000 // buy
					if( bearPower > -27.819 )
						ret := 0.750000 // buy
				if( Lower_Band > 585.296 )
					if( Lower_Band <= 616.307 )
						if( bbm <= 21.9274 )
							if( bullPower <= -11.2689 )
								ret := -1.000000 // sell
							if( bullPower > -11.2689 )
								ret := -0.750000 // sell
						if( bbm > 21.9274 )
							ret := -0.250000
					if( Lower_Band > 616.307 )
						ret := 0.750000 // buy
			if( Upper_Band > 669.114 )
				if( bbm <= 14.8759 )
					if( bullPower <= -13.0089 )
						ret := 0.500000
					if( bullPower > -13.0089 )
						if( bbm <= 13.76 )
							ret := 1.000000 // buy
						if( bbm > 13.76 )
							ret := 0.750000 // buy
				if( bbm > 14.8759 )
					ret := 1.000000 // buy
		if( bbp > -33.0241 )
			if( Lower_Band <= 626.956 )
				if( Upper_Band <= 628.161 )
					if( bullPower <= -3.52869 )
						if( Lower_Band <= 588.729 )
							if( bullPower <= -7.55479 )
								ret := -0.200000
							if( bullPower > -7.55479 )
								if( Upper_Band <= 606.859 )
									ret := -0.928571 // sell
								if( Upper_Band > 606.859 )
									ret := -0.642857
						if( Lower_Band > 588.729 )
							if( Lower_Band <= 593.475 )
								if( basis <= 603.867 )
									ret := -0.066667
								if( basis > 603.867 )
									ret := 0.583333
							if( Lower_Band > 593.475 )
								if( bearPower <= -11.3416 )
									ret := 0.142857
								if( bearPower > -11.3416 )
									ret := -0.552632
					if( bullPower > -3.52869 )
						if( Lower_Band <= 600.824 )
							if( Lower_Band <= 598.796 )
								if( Upper_Band <= 621.205 )
									ret := -0.099900
								if( Upper_Band > 621.205 )
									ret := -0.602273
							if( Lower_Band > 598.796 )
								if( basis <= 609.205 )
									ret := 0.101449
								if( basis > 609.205 )
									ret := 0.708861 // buy
						if( Lower_Band > 600.824 )
							if( bullPower <= -2.78068 )
								if( Upper_Band <= 620.609 )
									ret := -0.250000
								if( Upper_Band > 620.609 )
									ret := 0.888889 // buy
							if( bullPower > -2.78068 )
								if( bearPower <= 6.70238 )
									ret := -0.247238
								if( bearPower > 6.70238 )
									ret := 1.000000 // buy
				if( Upper_Band > 628.161 )
					if( Lower_Band <= 617.205 )
						if( bbp <= -9.45347 )
							if( Upper_Band <= 630.957 )
								if( Lower_Band <= 604.437 )
									ret := -0.909091 // sell
								if( Lower_Band > 604.437 )
									ret := 0.000000
							if( Upper_Band > 630.957 )
								if( bbm <= 17.964 )
									ret := 0.483660
								if( bbm > 17.964 )
									ret := -1.000000 // sell
						if( bbp > -9.45347 )
							if( bullPower <= -0.607226 )
								if( Upper_Band <= 636.687 )
									ret := -0.777778 // sell
								if( Upper_Band > 636.687 )
									ret := -0.285714
							if( bullPower > -0.607226 )
								if( Upper_Band <= 632.492 )
									ret := 0.159509
								if( Upper_Band > 632.492 )
									ret := -0.202454
					if( Lower_Band > 617.205 )
						if( bearPower <= -13.0336 )
							if( bbm <= 9.1463 )
								ret := -0.285714
							if( bbm > 9.1463 )
								ret := -1.000000 // sell
						if( bearPower > -13.0336 )
							if( Lower_Band <= 623.462 )
								if( basis <= 623.462 )
									ret := -0.500000
								if( basis > 623.462 )
									ret := 0.629252
							if( Lower_Band > 623.462 )
								if( Lower_Band <= 625.11 )
									ret := -0.136986
								if( Lower_Band > 625.11 )
									ret := 0.576271
			if( Lower_Band > 626.956 )
				if( bbp <= 5.68403 )
					if( Lower_Band <= 639.267 )
						if( Upper_Band <= 674.797 )
							if( Upper_Band <= 668.315 )
								if( bbp <= 0.894484 )
									ret := -0.111675
								if( bbp > 0.894484 )
									ret := 0.426230
							if( Upper_Band > 668.315 )
								if( basis <= 651.723 )
									ret := -0.875000 // sell
								if( basis > 651.723 )
									ret := 0.000000
						if( Upper_Band > 674.797 )
							if( Lower_Band <= 633.997 )
								if( bbp <= -3.48224 )
									ret := 1.000000 // buy
								if( bbp > -3.48224 )
									ret := 0.500000
							if( Lower_Band > 633.997 )
								ret := -0.250000
					if( Lower_Band > 639.267 )
						if( Lower_Band <= 668.798 )
							if( Lower_Band <= 657.942 )
								if( Upper_Band <= 683.234 )
									ret := -0.332117
								if( Upper_Band > 683.234 )
									ret := 0.483871
							if( Lower_Band > 657.942 )
								if( bearPower <= -9.44139 )
									ret := -0.200000
								if( bearPower > -9.44139 )
									ret := -0.880597 // sell
						if( Lower_Band > 668.798 )
							if( bbm <= 2.91892 )
								if( bullPower <= 0.693367 )
									ret := -0.375000
								if( bullPower > 0.693367 )
									ret := -0.069767
							if( bbm > 2.91892 )
								if( Lower_Band <= 695.398 )
									ret := 0.422535
								if( Lower_Band > 695.398 )
									ret := -0.285714
				if( bbp > 5.68403 )
					if( basis <= 656.885 )
						if( bbm <= 11.6165 )
							if( Lower_Band <= 635.988 )
								if( bullPower <= 5.51924 )
									ret := -0.400000
								if( bullPower > 5.51924 )
									ret := -0.914286 // sell
							if( Lower_Band > 635.988 )
								if( Lower_Band <= 639.104 )
									ret := 0.090909
								if( Lower_Band > 639.104 )
									ret := -0.793103 // sell
						if( bbm > 11.6165 )
							if( basis <= 648.013 )
								ret := 0.400000
							if( basis > 648.013 )
								ret := -0.250000
					if( basis > 656.885 )
						if( basis <= 689.701 )
							if( bbm <= 12.7846 )
								if( Upper_Band <= 705.362 )
									ret := 0.178571
								if( Upper_Band > 705.362 )
									ret := 0.888889 // buy
							if( bbm > 12.7846 )
								ret := -1.000000 // sell
						if( basis > 689.701 )
							if( bbp <= 9.34627 )
								if( Lower_Band <= 694.116 )
									ret := 0.000000
								if( Lower_Band > 694.116 )
									ret := -1.000000 // sell
							if( bbp > 9.34627 )
								if( Lower_Band <= 673.945 )
									ret := -0.750000 // sell
								if( Lower_Band > 673.945 )
									ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_BNBUSDT_30Min_52d404d8(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)

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


