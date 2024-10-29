//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: XLMUSDT_15Min_2BB0_9f74ddb3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_15Min_2BB0_9f74ddb3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_15Min_9f74ddb3(basis, Lower_Band, Upper_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bullPower <= -9.8e-05 )
		if( bbp <= -0.005533 )
			if( Upper_Band <= 0.184829 )
				if( basis <= 0.147909 )
					if( bearPower <= -0.006165 )
						if( basis <= 0.122734 )
							ret := 1.000000 // buy
						if( basis > 0.122734 )
							if( bbp <= -0.010984 )
								if( bullPower <= -0.005014 )
									ret := 0.000000
								if( bullPower > -0.005014 )
									ret := 0.972973 // buy
							if( bbp > -0.010984 )
								if( basis <= 0.144037 )
									ret := -0.120000
								if( basis > 0.144037 )
									ret := 0.684211
					if( bearPower > -0.006165 )
						if( basis <= 0.140897 )
							if( bearPower <= -0.004434 )
								if( Upper_Band <= 0.142473 )
									ret := 0.241071
								if( Upper_Band > 0.142473 )
									ret := -0.703704 // sell
							if( bearPower > -0.004434 )
								if( bearPower <= -0.004038 )
									ret := 0.362637
								if( bearPower > -0.004038 )
									ret := 0.626016
						if( basis > 0.140897 )
							if( Upper_Band <= 0.149103 )
								if( bbp <= -0.006111 )
									ret := -0.962963 // sell
								if( bbp > -0.006111 )
									ret := -0.750000 // sell
							if( Upper_Band > 0.149103 )
								if( Upper_Band <= 0.149736 )
									ret := 1.000000 // buy
								if( Upper_Band > 0.149736 )
									ret := -0.190476
				if( basis > 0.147909 )
					if( bullPower <= -0.001208 )
						if( bearPower <= -0.005412 )
							if( basis <= 0.166514 )
								ret := -0.400000
							if( basis > 0.166514 )
								ret := 1.000000 // buy
						if( bearPower > -0.005412 )
							if( bbm <= 0.002036 )
								ret := 0.571429
							if( bbm > 0.002036 )
								if( bbm <= 0.00264 )
									ret := 0.878788 // buy
								if( bbm > 0.00264 )
									ret := 1.000000 // buy
					if( bullPower > -0.001208 )
						ret := 0.250000
			if( Upper_Band > 0.184829 )
				ret := -1.000000 // sell
		if( bbp > -0.005533 )
			if( bbm <= 0.000538 )
				if( Lower_Band <= 0.103262 )
					if( Lower_Band <= 0.076417 )
						if( Lower_Band <= 0.076155 )
							if( Upper_Band <= 0.080286 )
								if( Lower_Band <= 0.072798 )
									ret := 0.454545
								if( Lower_Band > 0.072798 )
									ret := -0.119205
							if( Upper_Band > 0.080286 )
								if( basis <= 0.077155 )
									ret := -1.000000 // sell
								if( basis > 0.077155 )
									ret := -0.777778 // sell
						if( Lower_Band > 0.076155 )
							ret := -1.000000 // sell
					if( Lower_Band > 0.076417 )
						if( Upper_Band <= 0.102828 )
							if( bbm <= 0.0003 )
								if( basis <= 0.082192 )
									ret := 0.331522
								if( basis > 0.082192 )
									ret := 0.016795
							if( bbm > 0.0003 )
								if( Lower_Band <= 0.100502 )
									ret := 0.192449
								if( Lower_Band > 0.100502 )
									ret := -0.567568
						if( Upper_Band > 0.102828 )
							if( Lower_Band <= 0.100981 )
								if( bearPower <= -0.000956 )
									ret := -0.083333
								if( bearPower > -0.000956 )
									ret := 0.772727 // buy
							if( Lower_Band > 0.100981 )
								if( Upper_Band <= 0.103285 )
									ret := -0.171053
								if( Upper_Band > 0.103285 )
									ret := 0.258621
				if( Lower_Band > 0.103262 )
					if( bearPower <= -0.000904 )
						if( bullPower <= -0.000746 )
							if( bearPower <= -0.00148 )
								if( basis <= 0.117368 )
									ret := -0.018868
								if( basis > 0.117368 )
									ret := -0.297872
							if( bearPower > -0.00148 )
								if( basis <= 0.112298 )
									ret := 0.000000
								if( basis > 0.112298 )
									ret := 0.335260
						if( bullPower > -0.000746 )
							if( Lower_Band <= 0.127261 )
								if( Upper_Band <= 0.122807 )
									ret := -0.058166
								if( Upper_Band > 0.122807 )
									ret := -0.305556
							if( Lower_Band > 0.127261 )
								if( Lower_Band <= 0.137823 )
									ret := -0.598361
								if( Lower_Band > 0.137823 )
									ret := -0.075472
					if( bearPower > -0.000904 )
						if( Upper_Band <= 0.119821 )
							if( bearPower <= -0.000841 )
								if( Upper_Band <= 0.112729 )
									ret := -0.077670
								if( Upper_Band > 0.112729 )
									ret := 0.486239
							if( bearPower > -0.000841 )
								if( Upper_Band <= 0.11547 )
									ret := 0.004458
								if( Upper_Band > 0.11547 )
									ret := -0.144330
						if( Upper_Band > 0.119821 )
							if( basis <= 0.119943 )
								if( Lower_Band <= 0.118631 )
									ret := 0.357798
								if( Lower_Band > 0.118631 )
									ret := 0.778689 // buy
							if( basis > 0.119943 )
								if( Lower_Band <= 0.159493 )
									ret := 0.032615
								if( Lower_Band > 0.159493 )
									ret := 0.465517
			if( bbm > 0.000538 )
				if( Upper_Band <= 0.124747 )
					if( bbp <= -0.001894 )
						if( basis <= 0.108616 )
							if( bearPower <= -0.001498 )
								if( bbp <= -0.001941 )
									ret := 0.290043
								if( bbp > -0.001941 )
									ret := -0.750000 // sell
							if( bearPower > -0.001498 )
								if( bbp <= -0.00197 )
									ret := -0.203187
								if( bbp > -0.00197 )
									ret := 0.020619
						if( basis > 0.108616 )
							if( bullPower <= -0.001431 )
								if( basis <= 0.119903 )
									ret := -0.437908
								if( basis > 0.119903 )
									ret := 0.846154 // buy
							if( bullPower > -0.001431 )
								if( basis <= 0.111715 )
									ret := -0.143508
								if( basis > 0.111715 )
									ret := 0.095276
					if( bbp > -0.001894 )
						if( basis <= 0.120551 )
							if( Lower_Band <= 0.11742 )
								if( Upper_Band <= 0.114316 )
									ret := 0.176182
								if( Upper_Band > 0.114316 )
									ret := 0.364903
							if( Lower_Band > 0.11742 )
								if( bbp <= -0.001751 )
									ret := 0.517241
								if( bbp > -0.001751 )
									ret := -0.190083
						if( basis > 0.120551 )
							if( Lower_Band <= 0.119992 )
								if( bearPower <= -0.000805 )
									ret := 0.654676
								if( bearPower > -0.000805 )
									ret := 0.942857 // buy
							if( Lower_Band > 0.119992 )
								if( bbm <= 0.000804 )
									ret := 0.140244
								if( bbm > 0.000804 )
									ret := 0.649351
				if( Upper_Band > 0.124747 )
					if( Upper_Band <= 0.13819 )
						if( bbp <= -0.002277 )
							if( Upper_Band <= 0.134399 )
								if( bullPower <= -0.000745 )
									ret := 0.173203
								if( bullPower > -0.000745 )
									ret := -0.311203
							if( Upper_Band > 0.134399 )
								if( Lower_Band <= 0.13017 )
									ret := -0.759657 // sell
								if( Lower_Band > 0.13017 )
									ret := -0.107143
						if( bbp > -0.002277 )
							if( basis <= 0.135597 )
								if( bullPower <= -0.000684 )
									ret := 0.475000
								if( bullPower > -0.000684 )
									ret := 0.029446
							if( basis > 0.135597 )
								if( Upper_Band <= 0.13795 )
									ret := -1.000000 // sell
								if( Upper_Band > 0.13795 )
									ret := -0.263158
					if( Upper_Band > 0.13819 )
						if( Upper_Band <= 0.148308 )
							if( Lower_Band <= 0.139585 )
								if( Upper_Band <= 0.139074 )
									ret := 0.721461 // buy
								if( Upper_Band > 0.139074 )
									ret := 0.396601
							if( Lower_Band > 0.139585 )
								if( Upper_Band <= 0.146661 )
									ret := -0.200000
								if( Upper_Band > 0.146661 )
									ret := 0.719626 // buy
						if( Upper_Band > 0.148308 )
							if( Lower_Band <= 0.151825 )
								if( Lower_Band <= 0.14536 )
									ret := 0.015444
								if( Lower_Band > 0.14536 )
									ret := -0.393750
							if( Lower_Band > 0.151825 )
								if( Lower_Band <= 0.153189 )
									ret := 0.836735 // buy
								if( Lower_Band > 0.153189 )
									ret := 0.003436
	if( bullPower > -9.8e-05 )
		if( basis <= 0.142938 )
			if( Lower_Band <= 0.090975 )
				if( bullPower <= 0.000945 )
					if( Lower_Band <= 0.071325 )
						if( bullPower <= 0.000203 )
							if( bbm <= 0.000231 )
								if( bullPower <= 0.000147 )
									ret := 0.042553
								if( bullPower > 0.000147 )
									ret := -0.461538
							if( bbm > 0.000231 )
								if( Lower_Band <= 0.071064 )
									ret := 0.875000 // buy
								if( Lower_Band > 0.071064 )
									ret := 0.350000
						if( bullPower > 0.000203 )
							if( bbp <= 0.000274 )
								if( basis <= 0.071713 )
									ret := 0.777778 // buy
								if( basis > 0.071713 )
									ret := 0.933333 // buy
							if( bbp > 0.000274 )
								if( Lower_Band <= 0.071109 )
									ret := 0.000000
								if( Lower_Band > 0.071109 )
									ret := 0.545455
					if( Lower_Band > 0.071325 )
						if( bbp <= 0.000697 )
							if( bullPower <= 0.000719 )
								if( Upper_Band <= 0.091769 )
									ret := 0.026401
								if( Upper_Band > 0.091769 )
									ret := 0.245515
							if( bullPower > 0.000719 )
								if( bearPower <= -8e-05 )
									ret := 0.755556 // buy
								if( bearPower > -8e-05 )
									ret := 0.214286
						if( bbp > 0.000697 )
							if( basis <= 0.09192 )
								if( Upper_Band <= 0.080985 )
									ret := 0.186747
								if( Upper_Band > 0.080985 )
									ret := -0.075898
							if( basis > 0.09192 )
								if( bbm <= 0.000688 )
									ret := -0.944444 // sell
								if( bbm > 0.000688 )
									ret := -0.777778 // sell
				if( bullPower > 0.000945 )
					if( bbm <= 0.005559 )
						if( bullPower <= 0.003428 )
							if( bbm <= 0.000398 )
								if( Upper_Band <= 0.088791 )
									ret := 0.854167 // buy
								if( Upper_Band > 0.088791 )
									ret := -0.058824
							if( bbm > 0.000398 )
								if( Lower_Band <= 0.090349 )
									ret := 0.168551
								if( Lower_Band > 0.090349 )
									ret := 0.807692 // buy
						if( bullPower > 0.003428 )
							if( Upper_Band <= 0.099469 )
								if( bbm <= 0.001878 )
									ret := 1.000000 // buy
								if( bbm > 0.001878 )
									ret := 0.777778 // buy
							if( Upper_Band > 0.099469 )
								if( bearPower <= 0.004794 )
									ret := -0.090909
								if( bearPower > 0.004794 )
									ret := 1.000000 // buy
					if( bbm > 0.005559 )
						if( basis <= 0.112137 )
							ret := 1.000000 // buy
						if( basis > 0.112137 )
							if( Upper_Band <= 0.174159 )
								ret := -0.846154 // sell
							if( Upper_Band > 0.174159 )
								ret := -1.000000 // sell
			if( Lower_Band > 0.090975 )
				if( bearPower <= -0.000385 )
					if( Lower_Band <= 0.141354 )
						if( bearPower <= -0.002261 )
							if( basis <= 0.116977 )
								if( bearPower <= -0.00287 )
									ret := -0.083333
								if( bearPower > -0.00287 )
									ret := 0.555556
							if( basis > 0.116977 )
								if( bearPower <= -0.004406 )
									ret := 1.000000 // buy
								if( bearPower > -0.004406 )
									ret := 0.816667 // buy
						if( bearPower > -0.002261 )
							if( bearPower <= -0.000959 )
								if( basis <= 0.13025 )
									ret := -0.001844
								if( basis > 0.13025 )
									ret := -0.264078
							if( bearPower > -0.000959 )
								if( Upper_Band <= 0.092898 )
									ret := -0.356589
								if( Upper_Band > 0.092898 )
									ret := 0.050096
					if( Lower_Band > 0.141354 )
						if( bearPower <= -0.000533 )
							if( basis <= 0.142791 )
								if( Lower_Band <= 0.141566 )
									ret := 0.800000 // buy
								if( Lower_Band > 0.141566 )
									ret := 0.923077 // buy
							if( basis > 0.142791 )
								ret := 1.000000 // buy
						if( bearPower > -0.000533 )
							if( basis <= 0.142803 )
								ret := -0.062500
							if( basis > 0.142803 )
								ret := 0.727273 // buy
				if( bearPower > -0.000385 )
					if( Lower_Band <= 0.134239 )
						if( bearPower <= 4.4e-05 )
							if( basis <= 0.131464 )
								if( basis <= 0.130982 )
									ret := -0.029129
								if( basis > 0.130982 )
									ret := 0.318182
							if( basis > 0.131464 )
								if( Upper_Band <= 0.133308 )
									ret := -0.484848
								if( Upper_Band > 0.133308 )
									ret := -0.094005
						if( bearPower > 4.4e-05 )
							if( bearPower <= 0.001866 )
								if( bbp <= 0.002562 )
									ret := -0.089451
								if( bbp > 0.002562 )
									ret := 0.005650
							if( bearPower > 0.001866 )
								if( bullPower <= 0.005688 )
									ret := -0.219298
								if( bullPower > 0.005688 )
									ret := -0.605634
					if( Lower_Band > 0.134239 )
						if( basis <= 0.136577 )
							if( bbm <= 0.00129 )
								if( basis <= 0.13653 )
									ret := 0.441176
								if( basis > 0.13653 )
									ret := 1.000000 // buy
							if( bbm > 0.00129 )
								ret := -0.636364
						if( basis > 0.136577 )
							if( Upper_Band <= 0.143749 )
								if( bearPower <= 0.000958 )
									ret := -0.009536
								if( bearPower > 0.000958 )
									ret := 0.500000
							if( Upper_Band > 0.143749 )
								if( bearPower <= 0.002144 )
									ret := 0.361486
								if( bearPower > 0.002144 )
									ret := -0.583333
		if( basis > 0.142938 )
			if( Upper_Band <= 0.144979 )
				if( bearPower <= -0.000392 )
					if( bbm <= 0.000718 )
						ret := -0.904762 // sell
					if( bbm > 0.000718 )
						ret := -1.000000 // sell
				if( bearPower > -0.000392 )
					if( bbm <= 0.000701 )
						if( Lower_Band <= 0.142778 )
							ret := -0.625000
						if( Lower_Band > 0.142778 )
							ret := -0.200000
					if( bbm > 0.000701 )
						if( bbp <= 0.001063 )
							ret := -0.785714 // sell
						if( bbp > 0.001063 )
							ret := -1.000000 // sell
			if( Upper_Band > 0.144979 )
				if( bbm <= 0.00146 )
					if( Lower_Band <= 0.169518 )
						if( Upper_Band <= 0.16107 )
							if( basis <= 0.154134 )
								if( Upper_Band <= 0.152404 )
									ret := -0.240526
								if( Upper_Band > 0.152404 )
									ret := -0.744589 // sell
							if( basis > 0.154134 )
								if( bullPower <= 0.001074 )
									ret := -0.101990
								if( bullPower > 0.001074 )
									ret := 0.444444
						if( Upper_Band > 0.16107 )
							if( bearPower <= 0.000113 )
								if( Lower_Band <= 0.165392 )
									ret := -0.657343
								if( Lower_Band > 0.165392 )
									ret := 0.106383
							if( bearPower > 0.000113 )
								if( bbm <= 0.00068 )
									ret := -0.849057 // sell
								if( bbm > 0.00068 )
									ret := -0.632479
					if( Lower_Band > 0.169518 )
						if( Upper_Band <= 0.174971 )
							if( bearPower <= 0.000675 )
								if( Upper_Band <= 0.172287 )
									ret := 0.111111
								if( Upper_Band > 0.172287 )
									ret := 0.884298 // buy
							if( bearPower > 0.000675 )
								if( basis <= 0.17235 )
									ret := 0.400000
								if( basis > 0.17235 )
									ret := -0.900000 // sell
						if( Upper_Band > 0.174971 )
							if( Upper_Band <= 0.17889 )
								if( basis <= 0.176045 )
									ret := -0.287081
								if( basis > 0.176045 )
									ret := -0.851852 // sell
							if( Upper_Band > 0.17889 )
								if( bbp <= 0.001826 )
									ret := 0.106267
								if( bbp > 0.001826 )
									ret := -0.661538
				if( bbm > 0.00146 )
					if( basis <= 0.147689 )
						if( Lower_Band <= 0.138481 )
							if( basis <= 0.143983 )
								ret := -0.777778 // sell
							if( basis > 0.143983 )
								ret := -1.000000 // sell
						if( Lower_Band > 0.138481 )
							if( bbp <= 0.001901 )
								if( bbp <= 0.001402 )
									ret := 0.726027 // buy
								if( bbp > 0.001402 )
									ret := 0.941176 // buy
							if( bbp > 0.001901 )
								if( Upper_Band <= 0.153772 )
									ret := -0.153846
								if( Upper_Band > 0.153772 )
									ret := 0.800000 // buy
					if( basis > 0.147689 )
						if( bearPower <= 0.000182 )
							if( Lower_Band <= 0.143637 )
								if( basis <= 0.148525 )
									ret := 0.844444 // buy
								if( basis > 0.148525 )
									ret := 0.470588
							if( Lower_Band > 0.143637 )
								if( Lower_Band <= 0.159704 )
									ret := -0.030848
								if( Lower_Band > 0.159704 )
									ret := -0.272727
						if( bearPower > 0.000182 )
							if( Lower_Band <= 0.147538 )
								if( basis <= 0.152092 )
									ret := -0.951807 // sell
								if( basis > 0.152092 )
									ret := -0.800000 // sell
							if( Lower_Band > 0.147538 )
								if( Upper_Band <= 0.172784 )
									ret := -0.482051
								if( Upper_Band > 0.172784 )
									ret := 0.246377
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_XLMUSDT_15Min_9f74ddb3(basis, Lower_Band, Upper_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)

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


