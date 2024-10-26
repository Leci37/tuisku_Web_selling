//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: LYFT_1Min_2TV0_5c4ad23a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Min_2TV0_5c4ad23a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Min_5c4ad23a(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( ema12 <= 0.004084 )
		if( VIP <= 1.1233 )
			if( ema3 <= 13.4753 )
				if( VIP <= 0.665384 )
					if( ema13 <= -0.077544 )
						if( VIM <= 1.47496 )
							if( VIP_VIM <= -0.850387 )
								if( ema1 <= 12.3114 )
									ret := -0.700000 // sell
								if( ema1 > 12.3114 )
									ret := 0.782609 // buy
							if( VIP_VIM > -0.850387 )
								if( VIP <= 0.652719 )
									ret := 0.933333 // buy
								if( VIP > 0.652719 )
									ret := 0.400000
						if( VIM > 1.47496 )
							if( ema12 <= -0.052382 )
								if( ema1 <= 13.1867 )
									ret := 0.000000
								if( ema1 > 13.1867 )
									ret := -0.789474 // sell
							if( ema12 > -0.052382 )
								if( VIM <= 1.56072 )
									ret := 1.000000 // buy
								if( VIM > 1.56072 )
									ret := 0.615385
					if( ema13 > -0.077544 )
						if( ema2 <= 11.5755 )
							if( ema1 <= 11.0892 )
								if( VIP <= 0.657287 )
									ret := 0.480519
								if( VIP > 0.657287 )
									ret := -0.187500
							if( ema1 > 11.0892 )
								if( ema13 <= -0.038806 )
									ret := -0.623529
								if( ema13 > -0.038806 )
									ret := -0.152778
						if( ema2 > 11.5755 )
							if( ema3 <= 12.3757 )
								if( tema <= 11.5664 )
									ret := 0.873016 // buy
								if( tema > 11.5664 )
									ret := 0.419689
							if( ema3 > 12.3757 )
								if( ema13 <= -0.041086 )
									ret := 0.301282
								if( ema13 > -0.041086 )
									ret := -0.108696
				if( VIP > 0.665384 )
					if( ema2 <= 13.4449 )
						if( ema13 <= -0.373184 )
							if( ema3 <= 11.0434 )
								ret := -0.714286 // sell
							if( ema3 > 11.0434 )
								ret := -1.000000 // sell
						if( ema13 > -0.373184 )
							if( ema3 <= 9.19661 )
								if( VIP_VIM <= -0.274785 )
									ret := 0.040000
								if( VIP_VIM > -0.274785 )
									ret := 0.691176
							if( ema3 > 9.19661 )
								if( ema3 <= 9.32269 )
									ret := -0.404040
								if( ema3 > 9.32269 )
									ret := 0.093082
					if( ema2 > 13.4449 )
						if( ema12 <= -0.006268 )
							if( VIP <= 0.921987 )
								if( VIP_VIM <= -0.333635 )
									ret := 0.051724
								if( VIP_VIM > -0.333635 )
									ret := 0.548387
							if( VIP > 0.921987 )
								ret := -0.388889
						if( ema12 > -0.006268 )
							if( ema1 <= 13.4515 )
								if( tema <= 13.4455 )
									ret := 0.947368 // buy
								if( tema > 13.4455 )
									ret := 0.555556
							if( ema1 > 13.4515 )
								if( ema12 <= -0.00332 )
									ret := -0.214286
								if( ema12 > -0.00332 )
									ret := 0.519481
			if( ema3 > 13.4753 )
				if( tema <= 17.9637 )
					if( ema3 <= 18.0669 )
						if( ema1 <= 13.516 )
							if( VIM <= 1.26127 )
								if( ema13 <= -0.021151 )
									ret := -0.661290
								if( ema13 > -0.021151 )
									ret := -0.175309
							if( VIM > 1.26127 )
								if( ema2 <= 13.5014 )
									ret := 0.438202
								if( ema2 > 13.5014 )
									ret := -0.173913
						if( ema1 > 13.516 )
							if( ema12 <= -0.053829 )
								if( VIP_VIM <= -0.306328 )
									ret := -0.277910
								if( VIP_VIM > -0.306328 )
									ret := 0.913043 // buy
							if( ema12 > -0.053829 )
								if( ema12 <= -0.039239 )
									ret := 0.242531
								if( ema12 > -0.039239 )
									ret := 0.016315
					if( ema3 > 18.0669 )
						if( ema13 <= -0.084555 )
							ret := 1.000000 // buy
						if( ema13 > -0.084555 )
							ret := 0.833333 // buy
				if( tema > 17.9637 )
					if( ema2 <= 18.042 )
						if( ema12 <= -0.019369 )
							ret := -0.818182 // sell
						if( ema12 > -0.019369 )
							ret := -1.000000 // sell
					if( ema2 > 18.042 )
						if( VIP <= 0.929556 )
							ret := 0.214286
						if( VIP > 0.929556 )
							ret := -0.529412
		if( VIP > 1.1233 )
			if( VIM <= 6.82329 )
				if( tema <= 11.2928 )
					if( ema12 <= -0.007836 )
						if( VIP <= 1.27965 )
							if( ema12 <= -0.016076 )
								if( tema <= 10.8654 )
									ret := 0.000000
								if( tema > 10.8654 )
									ret := 0.809524 // buy
							if( ema12 > -0.016076 )
								if( VIM <= 1.44136 )
									ret := 0.142857
								if( VIM > 1.44136 )
									ret := -0.583333
						if( VIP > 1.27965 )
							if( VIP <= 5.3381 )
								if( VIP_VIM <= -0.004163 )
									ret := 0.662021
								if( VIP_VIM > -0.004163 )
									ret := 0.315789
							if( VIP > 5.3381 )
								ret := 0.062500
					if( ema12 > -0.007836 )
						if( ema13 <= 0.002891 )
							if( VIP_VIM <= 0.572018 )
								if( ema2 <= 9.08923 )
									ret := 0.925926 // buy
								if( ema2 > 9.08923 )
									ret := 0.092879
							if( VIP_VIM > 0.572018 )
								if( ema13 <= 0.000175 )
									ret := -0.230769
								if( ema13 > 0.000175 )
									ret := -0.653846
						if( ema13 > 0.002891 )
							if( VIP_VIM <= 1.07584 )
								if( VIM <= 1.81472 )
									ret := 0.195266
								if( VIM > 1.81472 )
									ret := 0.537234
							if( VIP_VIM > 1.07584 )
								ret := -0.450000
				if( tema > 11.2928 )
					if( ema12 <= -0.00469 )
						if( ema13 <= -0.018161 )
							if( ema1 <= 11.3223 )
								ret := -0.925926 // sell
							if( ema1 > 11.3223 )
								if( VIM <= 2.07086 )
									ret := 0.317352
								if( VIM > 2.07086 )
									ret := 0.035667
						if( ema13 > -0.018161 )
							if( VIP <= 4.03261 )
								if( VIP_VIM <= 0.000741 )
									ret := 0.188383
								if( VIP_VIM > 0.000741 )
									ret := 0.401163
							if( VIP > 4.03261 )
								if( ema12 <= -0.005927 )
									ret := 0.636364
								if( ema12 > -0.005927 )
									ret := 0.078947
					if( ema12 > -0.00469 )
						if( tema <= 11.4927 )
							if( VIM <= 1.79832 )
								if( ema12 <= 0.002566 )
									ret := 0.771429 // buy
								if( ema12 > 0.002566 )
									ret := -0.142857
							if( VIM > 1.79832 )
								if( VIP <= 2.30378 )
									ret := -0.880000 // sell
								if( VIP > 2.30378 )
									ret := -0.275510
						if( tema > 11.4927 )
							if( ema13 <= -0.008428 )
								if( ema2 <= 15.7807 )
									ret := 0.007812
								if( ema2 > 15.7807 )
									ret := -0.518519
							if( ema13 > -0.008428 )
								if( ema13 <= 0.016136 )
									ret := 0.110946
								if( ema13 > 0.016136 )
									ret := 0.666667
			if( VIM > 6.82329 )
				if( ema12 <= -0.004366 )
					if( VIM <= 14.4925 )
						if( VIM <= 7.18606 )
							if( ema13 <= -0.014225 )
								if( VIM <= 6.95358 )
									ret := 0.571429
								if( VIM > 6.95358 )
									ret := 1.000000 // buy
							if( ema13 > -0.014225 )
								ret := 0.476190
						if( VIM > 7.18606 )
							if( VIP <= 6.57204 )
								if( VIP_VIM <= -1.29957 )
									ret := 0.275862
								if( VIP_VIM > -1.29957 )
									ret := -0.500000
							if( VIP > 6.57204 )
								if( VIP_VIM <= -1.03562 )
									ret := 0.785714 // buy
								if( VIP_VIM > -1.03562 )
									ret := 0.412245
					if( VIM > 14.4925 )
						if( ema3 <= 12.5974 )
							if( tema <= 12.4406 )
								if( tema <= 12.3415 )
									ret := 0.750000 // buy
								if( tema > 12.3415 )
									ret := 0.166667
							if( tema > 12.4406 )
								ret := -1.000000 // sell
						if( ema3 > 12.5974 )
							if( VIP_VIM <= -1.94193 )
								ret := 0.333333
							if( VIP_VIM > -1.94193 )
								if( VIP_VIM <= 0.992537 )
									ret := 0.931818 // buy
								if( VIP_VIM > 0.992537 )
									ret := 0.714286 // buy
				if( ema12 > -0.004366 )
					if( ema1 <= 13.3618 )
						if( VIP_VIM <= -2.00854 )
							if( VIP <= 27.9762 )
								ret := 0.812500 // buy
							if( VIP > 27.9762 )
								ret := 0.200000
						if( VIP_VIM > -2.00854 )
							if( ema12 <= -0.002271 )
								if( ema3 <= 11.2865 )
									ret := 0.476190
								if( ema3 > 11.2865 )
									ret := 0.040000
							if( ema12 > -0.002271 )
								if( ema2 <= 10.6652 )
									ret := -0.593750
								if( ema2 > 10.6652 )
									ret := -0.047727
					if( ema1 > 13.3618 )
						if( ema13 <= 0.005423 )
							if( VIP_VIM <= -0.793017 )
								if( ema12 <= 0.001522 )
									ret := 0.027027
								if( ema12 > 0.001522 )
									ret := -0.562500
							if( VIP_VIM > -0.793017 )
								if( ema1 <= 16.262 )
									ret := 0.445596
								if( ema1 > 16.262 )
									ret := -0.013889
						if( ema13 > 0.005423 )
							if( ema12 <= 0.001047 )
								ret := 0.880000 // buy
							if( ema12 > 0.001047 )
								if( ema3 <= 16.0952 )
									ret := 0.166667
								if( ema3 > 16.0952 )
									ret := 0.769231 // buy
	if( ema12 > 0.004084 )
		if( ema3 <= 17.4054 )
			if( VIM <= 1.28403 )
				if( tema <= 11.4689 )
					if( ema3 <= 11.3752 )
						if( ema13 <= 0.015909 )
							if( tema <= 9.69597 )
								if( ema3 <= 9.64529 )
									ret := 0.066116
								if( ema3 > 9.64529 )
									ret := 0.725000 // buy
							if( tema > 9.69597 )
								if( ema2 <= 9.70167 )
									ret := -0.931034 // sell
								if( ema2 > 9.70167 )
									ret := -0.046988
						if( ema13 > 0.015909 )
							if( VIP_VIM <= 0.729854 )
								if( VIM <= 0.901476 )
									ret := 0.126121
								if( VIM > 0.901476 )
									ret := 0.365204
							if( VIP_VIM > 0.729854 )
								if( tema <= 10.8818 )
									ret := -0.655172
								if( tema > 10.8818 )
									ret := 0.178295
					if( ema3 > 11.3752 )
						if( ema2 <= 11.3969 )
							if( VIM <= 0.824604 )
								if( ema13 <= 0.020491 )
									ret := 0.500000
								if( ema13 > 0.020491 )
									ret := 0.222222
							if( VIM > 0.824604 )
								if( ema2 <= 11.3821 )
									ret := 0.800000 // buy
								if( ema2 > 11.3821 )
									ret := 1.000000 // buy
						if( ema2 > 11.3969 )
							if( VIP <= 1.05212 )
								if( ema1 <= 11.4317 )
									ret := 0.444444
								if( ema1 > 11.4317 )
									ret := 0.942857 // buy
							if( VIP > 1.05212 )
								if( ema3 <= 11.4111 )
									ret := 0.540230
								if( ema3 > 11.4111 )
									ret := -0.096774
				if( tema > 11.4689 )
					if( ema2 <= 17.2636 )
						if( ema1 <= 17.109 )
							if( ema1 <= 11.5099 )
								if( ema13 <= 0.01987 )
									ret := -0.013158
								if( ema13 > 0.01987 )
									ret := -0.429577
							if( ema1 > 11.5099 )
								if( VIM <= 0.641155 )
									ret := -0.177700
								if( VIM > 0.641155 )
									ret := 0.007668
						if( ema1 > 17.109 )
							if( ema3 <= 17.1015 )
								if( ema13 <= 0.035993 )
									ret := -0.900000 // sell
								if( ema13 > 0.035993 )
									ret := -0.538462
							if( ema3 > 17.1015 )
								if( VIM <= 1.15036 )
									ret := -0.295652
								if( VIM > 1.15036 )
									ret := 0.375000
					if( ema2 > 17.2636 )
						if( ema3 <= 17.3614 )
							if( VIP_VIM <= 0.29776 )
								if( ema1 <= 17.3167 )
									ret := 0.292308
								if( ema1 > 17.3167 )
									ret := 0.857143 // buy
							if( VIP_VIM > 0.29776 )
								if( ema13 <= 0.108112 )
									ret := 0.049383
								if( ema13 > 0.108112 )
									ret := 1.000000 // buy
						if( ema3 > 17.3614 )
							if( ema13 <= 0.053797 )
								if( VIM <= 0.895821 )
									ret := -0.589744
								if( VIM > 0.895821 )
									ret := 0.214286
							if( ema13 > 0.053797 )
								if( ema13 <= 0.080336 )
									ret := 0.515152
								if( ema13 > 0.080336 )
									ret := -0.272727
			if( VIM > 1.28403 )
				if( ema2 <= 16.9798 )
					if( ema3 <= 16.2295 )
						if( ema2 <= 15.7103 )
							if( VIP_VIM <= 0.061143 )
								if( VIP_VIM <= 0.026477 )
									ret := -0.091981
								if( VIP_VIM > 0.026477 )
									ret := 0.392405
							if( VIP_VIM > 0.061143 )
								if( ema12 <= 0.047346 )
									ret := -0.258457
								if( ema12 > 0.047346 )
									ret := 0.338028
						if( ema2 > 15.7103 )
							if( ema12 <= 0.045763 )
								if( VIM <= 2.96111 )
									ret := 0.005587
								if( VIM > 2.96111 )
									ret := 0.363636
							if( ema12 > 0.045763 )
								if( VIM <= 9.44283 )
									ret := -0.074074
								if( VIM > 9.44283 )
									ret := -0.937500 // sell
					if( ema3 > 16.2295 )
						if( ema13 <= 0.025482 )
							if( VIP_VIM <= -0.04513 )
								if( VIP_VIM <= -0.712706 )
									ret := -0.771429 // sell
								if( VIP_VIM > -0.712706 )
									ret := -0.413793
							if( VIP_VIM > -0.04513 )
								if( VIM <= 2.16559 )
									ret := 0.523810
								if( VIM > 2.16559 )
									ret := -0.094340
						if( ema13 > 0.025482 )
							if( VIM <= 11.6289 )
								if( VIP_VIM <= -0.044927 )
									ret := -0.352941
								if( VIP_VIM > -0.044927 )
									ret := -0.833333 // sell
							if( VIM > 11.6289 )
								ret := 0.181818
				if( ema2 > 16.9798 )
					if( ema12 <= 0.029774 )
						if( VIP <= 10.7354 )
							if( VIM <= 3.94724 )
								if( VIP <= 2.60283 )
									ret := 0.583942
								if( VIP > 2.60283 )
									ret := 0.060976
							if( VIM > 3.94724 )
								if( ema2 <= 17.2553 )
									ret := 0.666667
								if( ema2 > 17.2553 )
									ret := 0.972222 // buy
						if( VIP > 10.7354 )
							ret := -0.500000
					if( ema12 > 0.029774 )
						if( ema3 <= 17.2341 )
							if( ema1 <= 17.2054 )
								ret := -0.727273 // sell
							if( ema1 > 17.2054 )
								ret := -0.222222
						if( ema3 > 17.2341 )
							if( VIM <= 1.85743 )
								ret := -0.687500
							if( VIM > 1.85743 )
								ret := -1.000000 // sell
		if( ema3 > 17.4054 )
			if( tema <= 17.5792 )
				if( ema2 <= 17.5395 )
					if( VIM <= 0.975156 )
						if( tema <= 17.5695 )
							if( VIM <= 0.726507 )
								ret := 0.300000
							if( VIM > 0.726507 )
								if( ema13 <= 0.018537 )
									ret := -0.353846
								if( ema13 > 0.018537 )
									ret := -0.731707 // sell
						if( tema > 17.5695 )
							ret := 0.333333
					if( VIM > 0.975156 )
						if( VIP <= 1.83263 )
							if( ema2 <= 17.4647 )
								ret := -0.222222
							if( ema2 > 17.4647 )
								if( ema3 <= 17.5093 )
									ret := 0.689655
								if( ema3 > 17.5093 )
									ret := -0.090909
						if( VIP > 1.83263 )
							if( VIM <= 3.8587 )
								if( ema2 <= 17.4437 )
									ret := -0.818182 // sell
								if( ema2 > 17.4437 )
									ret := -1.000000 // sell
							if( VIM > 3.8587 )
								ret := 0.157895
				if( ema2 > 17.5395 )
					if( VIM <= 1.25739 )
						if( VIM <= 0.900673 )
							ret := 0.000000
						if( VIM > 0.900673 )
							if( VIP <= 1.09651 )
								ret := 0.700000 // buy
							if( VIP > 1.09651 )
								ret := 1.000000 // buy
					if( VIM > 1.25739 )
						if( VIP_VIM <= 0.250707 )
							ret := -0.428571
						if( VIP_VIM > 0.250707 )
							ret := 0.000000
			if( tema > 17.5792 )
				if( ema12 <= 0.136851 )
					if( VIP_VIM <= -0.023025 )
						if( VIP_VIM <= -0.390298 )
							ret := -0.500000
						if( VIP_VIM > -0.390298 )
							if( VIP <= 0.991909 )
								ret := -0.789474 // sell
							if( VIP > 0.991909 )
								if( ema13 <= 0.012774 )
									ret := -0.909091 // sell
								if( ema13 > 0.012774 )
									ret := -1.000000 // sell
					if( VIP_VIM > -0.023025 )
						if( ema3 <= 18.0394 )
							if( ema3 <= 17.896 )
								if( ema2 <= 17.5775 )
									ret := -0.307087
								if( ema2 > 17.5775 )
									ret := -0.649123
							if( ema3 > 17.896 )
								if( VIP_VIM <= 0.369725 )
									ret := 0.916667 // buy
								if( VIP_VIM > 0.369725 )
									ret := -0.500000
						if( ema3 > 18.0394 )
							ret := -1.000000 // sell
				if( ema12 > 0.136851 )
					ret := 0.428571
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_LYFT_1Min_5c4ad23a(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


