//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: META_15Min_2TV0_546401d6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_15Min_2TV0_546401d6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_15Min_546401d6(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema13 <= -0.042299 )
		if( ema13 <= -0.368203 )
			if( ema12 <= -2.19449 )
				if( tema <= 502.734 )
					if( tema <= 119.468 )
						if( ema2 <= 118.858 )
							if( ema2 <= 115.8 )
								if( ema2 <= 109.803 )
									ret := -0.363636
								if( ema2 > 109.803 )
									ret := -1.000000 // sell
							if( ema2 > 115.8 )
								ret := 0.454545
						if( ema2 > 118.858 )
							ret := -1.000000 // sell
					if( tema > 119.468 )
						if( ema3 <= 208.909 )
							if( ema13 <= -4.71243 )
								if( VIP_VIM <= -0.677558 )
									ret := 0.595238
								if( VIP_VIM > -0.677558 )
									ret := -0.642857
							if( ema13 > -4.71243 )
								if( ema13 <= -3.79686 )
									ret := 0.904762 // buy
								if( ema13 > -3.79686 )
									ret := 0.600000
						if( ema3 > 208.909 )
							if( ema1 <= 224.866 )
								if( VIP <= 0.70475 )
									ret := -0.714286 // sell
								if( VIP > 0.70475 )
									ret := 0.153846
							if( ema1 > 224.866 )
								if( ema2 <= 317.69 )
									ret := 0.509333
								if( ema2 > 317.69 )
									ret := 0.175476
				if( tema > 502.734 )
					if( ema1 <= 512.6 )
						if( VIP_VIM <= -0.590048 )
							ret := -0.250000
						if( VIP_VIM > -0.590048 )
							if( tema <= 507.804 )
								ret := -1.000000 // sell
							if( tema > 507.804 )
								ret := -0.636364
					if( ema1 > 512.6 )
						if( ema13 <= -5.11527 )
							if( ema3 <= 523.071 )
								ret := 0.166667
							if( ema3 > 523.071 )
								if( ema1 <= 533.233 )
									ret := -0.843750 // sell
								if( ema1 > 533.233 )
									ret := -0.153846
						if( ema13 > -5.11527 )
							if( ema1 <= 563.747 )
								if( VIM <= 1.25568 )
									ret := 0.352941
								if( VIM > 1.25568 )
									ret := 0.878788 // buy
							if( ema1 > 563.747 )
								ret := 0.333333
			if( ema12 > -2.19449 )
				if( ema2 <= 94.313 )
					if( VIM <= 1.07039 )
						ret := 0.090909
					if( VIM > 1.07039 )
						if( ema12 <= -0.385964 )
							ret := 0.470588
						if( ema12 > -0.385964 )
							if( ema13 <= -0.557645 )
								if( ema13 <= -0.685787 )
									ret := 0.846154 // buy
								if( ema13 > -0.685787 )
									ret := 1.000000 // buy
							if( ema13 > -0.557645 )
								ret := 0.636364
				if( ema2 > 94.313 )
					if( VIM <= 1.34652 )
						if( ema13 <= -1.63354 )
							if( ema13 <= -1.70465 )
								if( ema2 <= 111.533 )
									ret := -0.641791
								if( ema2 > 111.533 )
									ret := -0.064809
							if( ema13 > -1.70465 )
								if( ema3 <= 164.833 )
									ret := -0.625954
								if( ema3 > 164.833 )
									ret := -0.198819
						if( ema13 > -1.63354 )
							if( ema13 <= -1.38558 )
								if( VIP_VIM <= -0.268257 )
									ret := 0.137834
								if( VIP_VIM > -0.268257 )
									ret := -0.084351
							if( ema13 > -1.38558 )
								if( tema <= 128.045 )
									ret := 0.216867
								if( tema > 128.045 )
									ret := -0.026629
					if( VIM > 1.34652 )
						if( ema1 <= 131.436 )
							if( ema1 <= 129.852 )
								if( ema13 <= -0.590419 )
									ret := -0.259740
								if( ema13 > -0.590419 )
									ret := 0.339623
							if( ema1 > 129.852 )
								if( ema3 <= 131.388 )
									ret := -0.230769
								if( ema3 > 131.388 )
									ret := -0.975610 // sell
						if( ema1 > 131.436 )
							if( tema <= 133.079 )
								if( ema1 <= 132.909 )
									ret := 0.013889
								if( ema1 > 132.909 )
									ret := 0.735294 // buy
							if( tema > 133.079 )
								if( ema3 <= 563.711 )
									ret := 0.090458
								if( ema3 > 563.711 )
									ret := 0.531646
		if( ema13 > -0.368203 )
			if( ema3 <= 250.087 )
				if( ema12 <= -0.272072 )
					if( VIM <= 1.03249 )
						if( ema13 <= -0.361131 )
							ret := -0.769231 // sell
						if( ema13 > -0.361131 )
							if( tema <= 152.614 )
								ret := -0.529412
							if( tema > 152.614 )
								if( ema1 <= 237.066 )
									ret := 0.292453
								if( ema1 > 237.066 )
									ret := -0.533333
					if( VIM > 1.03249 )
						if( ema1 <= 185.355 )
							if( VIP_VIM <= -0.546669 )
								ret := -0.666667
							if( VIP_VIM > -0.546669 )
								if( ema3 <= 120.227 )
									ret := 0.877551 // buy
								if( ema3 > 120.227 )
									ret := 0.448980
						if( ema1 > 185.355 )
							if( ema12 <= -0.280498 )
								if( VIP_VIM <= -0.354108 )
									ret := -0.586957
								if( VIP_VIM > -0.354108 )
									ret := 0.134328
							if( ema12 > -0.280498 )
								ret := 0.950000 // buy
				if( ema12 > -0.272072 )
					if( ema2 <= 239.26 )
						if( tema <= 238.147 )
							if( ema3 <= 235.656 )
								if( ema3 <= 225.273 )
									ret := 0.028070
								if( ema3 > 225.273 )
									ret := 0.317365
							if( ema3 > 235.656 )
								if( ema12 <= -0.101102 )
									ret := -0.785714 // sell
								if( ema12 > -0.101102 )
									ret := 0.014706
						if( tema > 238.147 )
							if( ema13 <= -0.134741 )
								if( ema1 <= 238.607 )
									ret := -0.400000
								if( ema1 > 238.607 )
									ret := 0.633333
							if( ema13 > -0.134741 )
								if( ema2 <= 238.754 )
									ret := 0.958333 // buy
								if( ema2 > 238.754 )
									ret := 0.800000 // buy
					if( ema2 > 239.26 )
						if( VIP <= 1.18166 )
							if( VIP_VIM <= -0.022703 )
								if( ema2 <= 247.988 )
									ret := -0.335821
								if( ema2 > 247.988 )
									ret := -1.000000 // sell
							if( VIP_VIM > -0.022703 )
								if( VIP_VIM <= 0.183568 )
									ret := 0.175676
								if( VIP_VIM > 0.183568 )
									ret := 0.933333 // buy
						if( VIP > 1.18166 )
							if( ema13 <= -0.088752 )
								if( ema3 <= 243.821 )
									ret := -0.785714 // sell
								if( ema3 > 243.821 )
									ret := -0.060606
							if( ema13 > -0.088752 )
								ret := -1.000000 // sell
			if( ema3 > 250.087 )
				if( ema3 <= 299.828 )
					if( ema12 <= 0.215561 )
						if( VIP <= 1.07651 )
							if( ema2 <= 293.441 )
								if( tema <= 292.357 )
									ret := 0.215901
								if( tema > 292.357 )
									ret := -0.720000 // sell
							if( ema2 > 293.441 )
								if( VIP <= 0.945431 )
									ret := 0.720000 // buy
								if( VIP > 0.945431 )
									ret := 0.348214
						if( VIP > 1.07651 )
							if( tema <= 267.814 )
								if( ema12 <= 0.041062 )
									ret := 0.631944
								if( ema12 > 0.041062 )
									ret := 0.230769
							if( tema > 267.814 )
								if( ema1 <= 270.788 )
									ret := -0.212500
								if( ema1 > 270.788 )
									ret := 0.365796
					if( ema12 > 0.215561 )
						if( VIM <= 0.974465 )
							ret := -0.833333 // sell
						if( VIM > 0.974465 )
							ret := -0.368421
				if( ema3 > 299.828 )
					if( tema <= 356.105 )
						if( ema2 <= 353.079 )
							if( VIM <= 1.11889 )
								if( VIM <= 0.946959 )
									ret := -0.285714
								if( VIM > 0.946959 )
									ret := -0.011927
							if( VIM > 1.11889 )
								if( VIM <= 1.31302 )
									ret := 0.228420
								if( VIM > 1.31302 )
									ret := 0.009662
						if( ema2 > 353.079 )
							if( VIM <= 1.30331 )
								if( ema1 <= 354.274 )
									ret := 0.026316
								if( ema1 > 354.274 )
									ret := -0.608696
							if( VIM > 1.30331 )
								if( ema12 <= -0.07384 )
									ret := -0.972973 // sell
								if( ema12 > -0.07384 )
									ret := -0.500000
					if( tema > 356.105 )
						if( ema3 <= 365.68 )
							if( VIP_VIM <= -0.254644 )
								if( ema12 <= -0.094524 )
									ret := 0.095238
								if( ema12 > -0.094524 )
									ret := -0.300000
							if( VIP_VIM > -0.254644 )
								if( tema <= 362.924 )
									ret := 0.507353
								if( tema > 362.924 )
									ret := 0.964286 // buy
						if( ema3 > 365.68 )
							if( tema <= 387.131 )
								if( ema1 <= 379.612 )
									ret := 0.174157
								if( ema1 > 379.612 )
									ret := -0.704225 // sell
							if( tema > 387.131 )
								if( ema2 <= 395.656 )
									ret := 0.640000
								if( ema2 > 395.656 )
									ret := 0.204368
	if( ema13 > -0.042299 )
		if( VIM <= 2.39632 )
			if( ema3 <= 358.745 )
				if( ema1 <= 133.778 )
					if( ema1 <= 123.43 )
						if( ema3 <= 121.791 )
							if( ema13 <= 0.241726 )
								if( VIM <= 1.03055 )
									ret := -0.253071
								if( VIM > 1.03055 )
									ret := 0.019116
							if( ema13 > 0.241726 )
								if( ema1 <= 95.3298 )
									ret := 0.654676
								if( ema1 > 95.3298 )
									ret := 0.059976
						if( ema3 > 121.791 )
							if( ema13 <= 0.422586 )
								if( ema1 <= 123.173 )
									ret := -0.637931
								if( ema1 > 123.173 )
									ret := -0.972973 // sell
							if( ema13 > 0.422586 )
								if( ema2 <= 122.586 )
									ret := -0.722222 // sell
								if( ema2 > 122.586 )
									ret := 0.562500
					if( ema1 > 123.43 )
						if( ema2 <= 126.424 )
							if( ema12 <= 0.075968 )
								if( tema <= 124.749 )
									ret := 0.720930 // buy
								if( tema > 124.749 )
									ret := -0.170732
							if( ema12 > 0.075968 )
								if( VIM <= 0.805934 )
									ret := 0.023810
								if( VIM > 0.805934 )
									ret := 0.680628
						if( ema2 > 126.424 )
							if( ema12 <= 0.804994 )
								if( VIP <= 1.19781 )
									ret := 0.188418
								if( VIP > 1.19781 )
									ret := -0.058176
							if( ema12 > 0.804994 )
								if( VIP <= 1.22799 )
									ret := -0.151163
								if( VIP > 1.22799 )
									ret := 0.841667 // buy
				if( ema1 > 133.778 )
					if( ema3 <= 153.042 )
						if( ema2 <= 149.192 )
							if( ema3 <= 145.487 )
								if( tema <= 143.126 )
									ret := -0.031679
								if( tema > 143.126 )
									ret := -0.283418
							if( ema3 > 145.487 )
								if( ema2 <= 147.365 )
									ret := 0.368613
								if( ema2 > 147.365 )
									ret := -0.037801
						if( ema2 > 149.192 )
							if( ema1 <= 155.95 )
								if( ema12 <= 1.43767 )
									ret := -0.242440
								if( ema12 > 1.43767 )
									ret := 0.712121 // buy
							if( ema1 > 155.95 )
								ret := 0.944444 // buy
					if( ema3 > 153.042 )
						if( ema3 <= 187.557 )
							if( ema1 <= 186.75 )
								if( VIM <= 0.790027 )
									ret := 0.091211
								if( VIM > 0.790027 )
									ret := -0.020644
							if( ema1 > 186.75 )
								if( ema12 <= 0.051771 )
									ret := 0.696721
								if( ema12 > 0.051771 )
									ret := 0.165083
						if( ema3 > 187.557 )
							if( tema <= 191.696 )
								if( VIM <= 0.836564 )
									ret := 0.083146
								if( VIM > 0.836564 )
									ret := -0.242188
							if( tema > 191.696 )
								if( tema <= 195.046 )
									ret := 0.054387
								if( tema > 195.046 )
									ret := -0.041802
			if( ema3 > 358.745 )
				if( VIP <= 1.0662 )
					if( ema1 <= 497.129 )
						if( ema2 <= 494.614 )
							if( tema <= 474.314 )
								if( ema1 <= 361.491 )
									ret := 0.730159 // buy
								if( ema1 > 361.491 )
									ret := 0.103576
							if( tema > 474.314 )
								if( ema1 <= 490.998 )
									ret := 0.490066
								if( ema1 > 490.998 )
									ret := -0.152174
						if( ema2 > 494.614 )
							if( VIP_VIM <= -0.113502 )
								ret := 0.789474 // buy
							if( VIP_VIM > -0.113502 )
								if( tema <= 495.794 )
									ret := 0.823529 // buy
								if( tema > 495.794 )
									ret := 0.982759 // buy
					if( ema1 > 497.129 )
						if( ema3 <= 497.461 )
							if( tema <= 497.859 )
								if( VIP <= 0.958581 )
									ret := 0.000000
								if( VIP > 0.958581 )
									ret := -0.916667 // sell
							if( tema > 497.859 )
								if( VIM <= 0.892273 )
									ret := -0.888889 // sell
								if( VIM > 0.892273 )
									ret := -1.000000 // sell
						if( ema3 > 497.461 )
							if( tema <= 499.818 )
								if( ema2 <= 498.079 )
									ret := 1.000000 // buy
								if( ema2 > 498.079 )
									ret := 0.200000
							if( tema > 499.818 )
								if( ema12 <= -0.25435 )
									ret := -0.666667
								if( ema12 > -0.25435 )
									ret := 0.064478
				if( VIP > 1.0662 )
					if( tema <= 470.223 )
						if( ema2 <= 427.341 )
							if( VIM <= 0.921687 )
								if( ema2 <= 391.632 )
									ret := 0.180195
								if( ema2 > 391.632 )
									ret := -0.126582
							if( VIM > 0.921687 )
								if( ema1 <= 395.84 )
									ret := -0.060554
								if( ema1 > 395.84 )
									ret := -0.609756
						if( ema2 > 427.341 )
							if( ema2 <= 438.07 )
								if( VIP_VIM <= 0.302705 )
									ret := 0.911111 // buy
								if( VIP_VIM > 0.302705 )
									ret := 0.479167
							if( ema2 > 438.07 )
								if( tema <= 452.054 )
									ret := -0.167742
								if( tema > 452.054 )
									ret := 0.293729
					if( tema > 470.223 )
						if( ema2 <= 476.064 )
							if( tema <= 480.495 )
								if( VIM <= 0.755375 )
									ret := 0.083333
								if( VIM > 0.755375 )
									ret := -0.359307
							if( tema > 480.495 )
								ret := -1.000000 // sell
						if( ema2 > 476.064 )
							if( tema <= 499.008 )
								if( ema2 <= 497.288 )
									ret := 0.081500
								if( ema2 > 497.288 )
									ret := 0.753425 // buy
							if( tema > 499.008 )
								if( ema1 <= 508.933 )
									ret := -0.238548
								if( ema1 > 508.933 )
									ret := 0.055657
		if( VIM > 2.39632 )
			if( ema3 <= 179.485 )
				if( ema1 <= 116.81 )
					if( ema1 <= 116.632 )
						ret := -0.461538
					if( ema1 > 116.632 )
						ret := -0.909091 // sell
				if( ema1 > 116.81 )
					if( ema2 <= 174.422 )
						if( VIP_VIM <= 0.295755 )
							if( VIP <= 2.02958 )
								ret := -0.461538
							if( VIP > 2.02958 )
								if( VIP_VIM <= 0.210206 )
									ret := 0.006173
								if( VIP_VIM > 0.210206 )
									ret := -0.352941
						if( VIP_VIM > 0.295755 )
							if( ema3 <= 149.7 )
								if( ema2 <= 148.847 )
									ret := 0.120000
								if( ema2 > 148.847 )
									ret := 0.882353 // buy
							if( ema3 > 149.7 )
								ret := 0.000000
					if( ema2 > 174.422 )
						if( ema13 <= 0.396675 )
							if( tema <= 177.176 )
								ret := 0.222222
							if( tema > 177.176 )
								ret := 0.000000
						if( ema13 > 0.396675 )
							ret := 1.000000 // buy
			if( ema3 > 179.485 )
				if( tema <= 180.439 )
					ret := -1.000000 // sell
				if( tema > 180.439 )
					if( ema13 <= 0.298948 )
						if( VIM <= 3.52137 )
							if( ema2 <= 358.284 )
								if( ema1 <= 333.712 )
									ret := -0.058140
								if( ema1 > 333.712 )
									ret := -0.482759
							if( ema2 > 358.284 )
								if( ema1 <= 512.406 )
									ret := 0.666667
								if( ema1 > 512.406 )
									ret := -0.800000 // sell
						if( VIM > 3.52137 )
							if( VIP <= 4.59952 )
								if( ema2 <= 376.845 )
									ret := -0.090909
								if( ema2 > 376.845 )
									ret := -0.920000 // sell
							if( VIP > 4.59952 )
								ret := 0.166667
					if( ema13 > 0.298948 )
						if( VIP <= 4.14696 )
							if( tema <= 193.215 )
								if( ema12 <= 0.265609 )
									ret := -0.806452 // sell
								if( ema12 > 0.265609 )
									ret := -0.333333
							if( tema > 193.215 )
								if( ema3 <= 262.19 )
									ret := -0.113636
								if( ema3 > 262.19 )
									ret := -0.486486
						if( VIP > 4.14696 )
							ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_META_15Min_546401d6(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


