//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: DOTUSDT_15Min_2BT0_b988aeae Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_15Min_2BT0_b988aeae", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_15Min_b988aeae(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= -0.071299 )
		if( tema <= 11.2265 )
			if( ema13 <= -0.128919 )
				if( ema1 <= 10.2576 )
					if( ema12 <= -0.277241 )
						if( bbp <= -0.715835 )
							if( ema2 <= 9.71855 )
								ret := 1.000000 // buy
							if( ema2 > 9.71855 )
								ret := 0.923077 // buy
						if( bbp > -0.715835 )
							if( ema2 <= 7.73681 )
								ret := 1.000000 // buy
							if( ema2 > 7.73681 )
								ret := 0.266667
					if( ema12 > -0.277241 )
						if( ema12 <= -0.154835 )
							if( ema2 <= 7.38425 )
								if( ema2 <= 5.55143 )
									ret := -0.482759
								if( ema2 > 5.55143 )
									ret := 0.686275
							if( ema2 > 7.38425 )
								if( ema12 <= -0.176437 )
									ret := -0.851064 // sell
								if( ema12 > -0.176437 )
									ret := -0.192308
						if( ema12 > -0.154835 )
							if( tema <= 9.28177 )
								if( tema <= 7.95515 )
									ret := 0.164214
								if( tema > 7.95515 )
									ret := 0.507740
							if( tema > 9.28177 )
								if( ema1 <= 9.43705 )
									ret := -0.958904 // sell
								if( ema1 > 9.43705 )
									ret := 0.018913
				if( ema1 > 10.2576 )
					if( ema13 <= -0.369576 )
						if( tema <= 10.6316 )
							ret := 0.777778 // buy
						if( tema > 10.6316 )
							if( bbm <= 0.22074 )
								ret := -1.000000 // sell
							if( bbm > 0.22074 )
								ret := -0.909091 // sell
					if( ema13 > -0.369576 )
						if( bullPower <= -0.081901 )
							if( ema1 <= 11.1693 )
								if( bbm <= 0.1205 )
									ret := 0.625000
								if( bbm > 0.1205 )
									ret := 0.935714 // buy
							if( ema1 > 11.1693 )
								if( bbm <= 0.216653 )
									ret := -0.333333
								if( bbm > 0.216653 )
									ret := 1.000000 // buy
						if( bullPower > -0.081901 )
							if( bbp <= -0.110353 )
								if( bearPower <= -0.265946 )
									ret := 0.098039
								if( bearPower > -0.265946 )
									ret := 0.667984
							if( bbp > -0.110353 )
								ret := -0.333333
			if( ema13 > -0.128919 )
				if( ema3 <= 10.3466 )
					if( bearPower <= -0.076903 )
						if( ema2 <= 5.96857 )
							if( bbp <= -0.203417 )
								if( bullPower <= -0.075303 )
									ret := 0.366972
								if( bullPower > -0.075303 )
									ret := 0.830357 // buy
							if( bbp > -0.203417 )
								if( ema1 <= 4.20416 )
									ret := 0.647887
								if( ema1 > 4.20416 )
									ret := 0.201581
						if( ema2 > 5.96857 )
							if( bbp <= -0.26342 )
								if( ema2 <= 9.2216 )
									ret := -0.237603
								if( ema2 > 9.2216 )
									ret := 0.268293
							if( bbp > -0.26342 )
								if( bbp <= -0.094994 )
									ret := 0.106933
								if( bbp > -0.094994 )
									ret := 0.295165
					if( bearPower > -0.076903 )
						if( ema12 <= -0.008466 )
							if( bullPower <= -0.02146 )
								if( ema12 <= -0.027672 )
									ret := 0.083117
								if( ema12 > -0.027672 )
									ret := -0.058754
							if( bullPower > -0.02146 )
								if( ema12 <= -0.050224 )
									ret := -0.888889 // sell
								if( ema12 > -0.050224 )
									ret := 0.140187
						if( ema12 > -0.008466 )
							if( ema12 <= -0.007986 )
								if( ema3 <= 7.25333 )
									ret := -0.285714
								if( ema3 > 7.25333 )
									ret := -1.000000 // sell
							if( ema12 > -0.007986 )
								if( ema3 <= 7.53488 )
									ret := 0.113043
								if( ema3 > 7.53488 )
									ret := -0.416667
				if( ema3 > 10.3466 )
					if( bbm <= 0.140257 )
						if( tema <= 10.2614 )
							if( bullPower <= -0.076457 )
								ret := -0.500000
							if( bullPower > -0.076457 )
								ret := -1.000000 // sell
						if( tema > 10.2614 )
							if( bearPower <= -0.147716 )
								if( ema13 <= -0.115561 )
									ret := -0.833333 // sell
								if( ema13 > -0.115561 )
									ret := 0.555556
							if( bearPower > -0.147716 )
								if( ema1 <= 10.9908 )
									ret := -0.171355
								if( ema1 > 10.9908 )
									ret := -0.934783 // sell
					if( bbm > 0.140257 )
						if( ema1 <= 11.2567 )
							if( ema3 <= 10.4239 )
								ret := -0.250000
							if( ema3 > 10.4239 )
								if( ema12 <= -0.073745 )
									ret := -0.187500
								if( ema12 > -0.073745 )
									ret := -0.881818 // sell
						if( ema1 > 11.2567 )
							ret := 1.000000 // buy
		if( tema > 11.2265 )
			if( ema3 <= 13.237 )
				if( bullPower <= -0.116837 )
					if( bbm <= 0.237565 )
						if( bearPower <= -0.327217 )
							ret := -1.000000 // sell
						if( bearPower > -0.327217 )
							ret := 0.000000
					if( bbm > 0.237565 )
						ret := 0.785714 // buy
				if( bullPower > -0.116837 )
					if( ema12 <= -0.029117 )
						if( ema12 <= -0.100333 )
							if( ema3 <= 11.9686 )
								ret := -0.900000 // sell
							if( ema3 > 11.9686 )
								if( ema2 <= 12.1649 )
									ret := 0.111111
								if( ema2 > 12.1649 )
									ret := -0.800000 // sell
						if( ema12 > -0.100333 )
							if( bbm <= 0.195 )
								if( ema1 <= 11.6869 )
									ret := -0.954545 // sell
								if( ema1 > 11.6869 )
									ret := -1.000000 // sell
							if( bbm > 0.195 )
								ret := -0.750000 // sell
					if( ema12 > -0.029117 )
						if( bullPower <= -0.009589 )
							ret := 0.200000
						if( bullPower > -0.009589 )
							if( ema3 <= 11.4126 )
								ret := -0.454545
							if( ema3 > 11.4126 )
								ret := -1.000000 // sell
			if( ema3 > 13.237 )
				if( ema2 <= 15.238 )
					if( ema2 <= 14.9931 )
						if( ema13 <= -0.061764 )
							if( ema12 <= -0.200994 )
								ret := -0.857143 // sell
							if( ema12 > -0.200994 )
								if( ema1 <= 13.8988 )
									ret := 0.025000
								if( ema1 > 13.8988 )
									ret := 0.703704 // buy
						if( ema13 > -0.061764 )
							if( bbm <= 0.076154 )
								if( bearPower <= -0.073284 )
									ret := 0.250000
								if( bearPower > -0.073284 )
									ret := 0.833333 // buy
							if( bbm > 0.076154 )
								if( bearPower <= -0.210943 )
									ret := -0.181818
								if( bearPower > -0.210943 )
									ret := -0.808696 // sell
					if( ema2 > 14.9931 )
						if( bullPower <= -0.093863 )
							if( ema2 <= 15.1406 )
								ret := 0.833333 // buy
							if( ema2 > 15.1406 )
								ret := -0.571429
						if( bullPower > -0.093863 )
							if( bearPower <= -0.118814 )
								if( ema1 <= 15.0729 )
									ret := 0.900000 // buy
								if( ema1 > 15.0729 )
									ret := 1.000000 // buy
							if( bearPower > -0.118814 )
								ret := 0.714286 // buy
				if( ema2 > 15.238 )
					if( tema <= 16.5701 )
						if( tema <= 15.5838 )
							if( bbp <= -1.10596 )
								ret := 0.000000
							if( bbp > -1.10596 )
								if( bearPower <= -0.25853 )
									ret := -1.000000 // sell
								if( bearPower > -0.25853 )
									ret := -0.719298 // sell
						if( tema > 15.5838 )
							if( ema13 <= -0.115013 )
								if( tema <= 16.0401 )
									ret := 0.580645
								if( tema > 16.0401 )
									ret := -0.304348
							if( ema13 > -0.115013 )
								if( tema <= 15.9737 )
									ret := -0.931034 // sell
								if( tema > 15.9737 )
									ret := -0.618421
					if( tema > 16.5701 )
						if( bbp <= -0.120015 )
							if( bbm <= 0.170631 )
								if( ema13 <= -0.003588 )
									ret := 0.145161
								if( ema13 > -0.003588 )
									ret := 0.950000 // buy
							if( bbm > 0.170631 )
								ret := 0.944444 // buy
						if( bbp > -0.120015 )
							if( bearPower <= -0.095231 )
								if( ema12 <= -0.018224 )
									ret := -0.615385
								if( ema12 > -0.018224 )
									ret := -1.000000 // sell
							if( bearPower > -0.095231 )
								ret := 0.000000
	if( bbp > -0.071299 )
		if( ema2 <= 6.42635 )
			if( bbm <= 0.015528 )
				if( ema13 <= 0.0063 )
					if( tema <= 4.02081 )
						if( bearPower <= -0.015295 )
							if( ema1 <= 3.81759 )
								if( ema2 <= 3.67565 )
									ret := 0.300000
								if( ema2 > 3.67565 )
									ret := -0.125000
							if( ema1 > 3.81759 )
								if( bbm <= 0.010714 )
									ret := -0.025641
								if( bbm > 0.010714 )
									ret := 0.571429
						if( bearPower > -0.015295 )
							if( ema3 <= 3.97479 )
								if( ema3 <= 3.75263 )
									ret := 0.051765
								if( ema3 > 3.75263 )
									ret := -0.407895
							if( ema3 > 3.97479 )
								if( ema2 <= 3.97896 )
									ret := 0.952381 // buy
								if( ema2 > 3.97896 )
									ret := 0.111111
					if( tema > 4.02081 )
						if( ema1 <= 6.36791 )
							if( bearPower <= 0.003435 )
								if( ema1 <= 4.07633 )
									ret := -0.186579
								if( ema1 > 4.07633 )
									ret := -0.062002
							if( bearPower > 0.003435 )
								if( ema3 <= 5.20253 )
									ret := -0.255814
								if( ema3 > 5.20253 )
									ret := -0.017467
						if( ema1 > 6.36791 )
							if( ema12 <= -0.012764 )
								if( ema3 <= 6.41332 )
									ret := -0.833333 // sell
								if( ema3 > 6.41332 )
									ret := -1.000000 // sell
							if( ema12 > -0.012764 )
								if( ema13 <= 0.001393 )
									ret := -0.500000
								if( ema13 > 0.001393 )
									ret := 0.304348
				if( ema13 > 0.0063 )
					if( ema2 <= 4.19505 )
						if( ema12 <= 0.008009 )
							if( bbp <= 0.026073 )
								if( bbp <= -0.005879 )
									ret := 0.341463
								if( bbp > -0.005879 )
									ret := -0.021978
							if( bbp > 0.026073 )
								if( bearPower <= 0.007765 )
									ret := 1.000000 // buy
								if( bearPower > 0.007765 )
									ret := 0.109375
						if( ema12 > 0.008009 )
							if( ema1 <= 3.72869 )
								if( ema1 <= 3.68043 )
									ret := 1.000000 // buy
								if( ema1 > 3.68043 )
									ret := 0.363636
							if( ema1 > 3.72869 )
								if( tema <= 4.15406 )
									ret := -0.176471
								if( tema > 4.15406 )
									ret := -0.490741
					if( ema2 > 4.19505 )
						if( ema1 <= 6.42145 )
							if( ema2 <= 6.21535 )
								if( bullPower <= 0.025552 )
									ret := 0.063413
								if( bullPower > 0.025552 )
									ret := 0.198786
							if( ema2 > 6.21535 )
								if( ema3 <= 6.28118 )
									ret := -0.367816
								if( ema3 > 6.28118 )
									ret := -0.070064
						if( ema1 > 6.42145 )
							ret := 1.000000 // buy
			if( bbm > 0.015528 )
				if( ema1 <= 4.13089 )
					if( ema13 <= 0.035602 )
						if( ema12 <= -0.013687 )
							if( tema <= 4.08245 )
								if( tema <= 4.06811 )
									ret := 0.540541
								if( tema > 4.06811 )
									ret := -0.727273 // sell
							if( tema > 4.08245 )
								if( bearPower <= -0.039322 )
									ret := 0.956522 // buy
								if( bearPower > -0.039322 )
									ret := 0.777778 // buy
						if( ema12 > -0.013687 )
							if( bullPower <= 0.041505 )
								if( ema12 <= -0.006069 )
									ret := -0.051515
								if( ema12 > -0.006069 )
									ret := 0.203807
							if( bullPower > 0.041505 )
								if( ema2 <= 4.03479 )
									ret := -0.607595
								if( ema2 > 4.03479 )
									ret := 0.545455
					if( ema13 > 0.035602 )
						if( tema <= 3.95586 )
							ret := 0.062500
						if( tema > 3.95586 )
							if( ema12 <= 0.026748 )
								if( bbp <= 0.048974 )
									ret := 0.875000 // buy
								if( bbp > 0.048974 )
									ret := 1.000000 // buy
							if( ema12 > 0.026748 )
								if( bearPower <= 0.038139 )
									ret := 0.166667
								if( bearPower > 0.038139 )
									ret := 0.875000 // buy
				if( ema1 > 4.13089 )
					if( ema3 <= 6.35358 )
						if( ema2 <= 6.35015 )
							if( bearPower <= -0.103125 )
								if( ema12 <= -0.005018 )
									ret := 0.571429
								if( ema12 > -0.005018 )
									ret := 1.000000 // buy
							if( bearPower > -0.103125 )
								if( tema <= 6.16587 )
									ret := 0.013996
								if( tema > 6.16587 )
									ret := 0.074317
						if( ema2 > 6.35015 )
							if( bullPower <= 0.15585 )
								if( ema2 <= 6.38013 )
									ret := -0.522267
								if( ema2 > 6.38013 )
									ret := 0.085714
							if( bullPower > 0.15585 )
								if( ema13 <= 0.150951 )
									ret := 0.833333 // buy
								if( ema13 > 0.150951 )
									ret := -0.555556
					if( ema3 > 6.35358 )
						if( bullPower <= -0.012164 )
							if( ema13 <= -0.038248 )
								if( ema3 <= 6.40087 )
									ret := 0.875000 // buy
								if( ema3 > 6.40087 )
									ret := -0.090909
							if( ema13 > -0.038248 )
								if( tema <= 6.36283 )
									ret := -0.647887
								if( tema > 6.36283 )
									ret := 0.107143
						if( bullPower > -0.012164 )
							if( tema <= 6.32454 )
								if( bbm <= 0.040279 )
									ret := -0.815789 // sell
								if( bbm > 0.040279 )
									ret := 0.275000
							if( tema > 6.32454 )
								if( ema12 <= -0.000387 )
									ret := 0.341289
								if( ema12 > -0.000387 )
									ret := 0.097211
		if( ema2 > 6.42635 )
			if( ema3 <= 11.0305 )
				if( ema13 <= 0.20805 )
					if( ema3 <= 6.48738 )
						if( ema12 <= 0.036154 )
							if( bullPower <= -0.010469 )
								if( ema1 <= 6.44245 )
									ret := 0.384615
								if( ema1 > 6.44245 )
									ret := -0.255814
							if( bullPower > -0.010469 )
								if( ema12 <= -0.018828 )
									ret := 0.640000
								if( ema12 > -0.018828 )
									ret := -0.234946
						if( ema12 > 0.036154 )
							if( tema <= 6.66912 )
								if( tema <= 6.55055 )
									ret := -0.093750
								if( tema > 6.55055 )
									ret := 0.729167 // buy
							if( tema > 6.66912 )
								ret := -0.733333 // sell
					if( ema3 > 6.48738 )
						if( bearPower <= -0.100694 )
							if( ema13 <= 0.038962 )
								if( bbp <= -0.068297 )
									ret := 0.160000
								if( bbp > -0.068297 )
									ret := 0.675676
							if( ema13 > 0.038962 )
								if( bearPower <= -0.114879 )
									ret := -0.375000
								if( bearPower > -0.114879 )
									ret := -0.090909
						if( bearPower > -0.100694 )
							if( ema1 <= 11.1053 )
								if( bbm <= 0.06679 )
									ret := -0.027718
								if( bbm > 0.06679 )
									ret := -0.085859
							if( ema1 > 11.1053 )
								if( bullPower <= 0.201298 )
									ret := -1.000000 // sell
								if( bullPower > 0.201298 )
									ret := -0.875000 // sell
				if( ema13 > 0.20805 )
					if( bbp <= 0.870965 )
						if( ema12 <= 0.170262 )
							if( bullPower <= 0.241751 )
								if( ema13 <= 0.240227 )
									ret := 0.243590
								if( ema13 > 0.240227 )
									ret := 0.636986
							if( bullPower > 0.241751 )
								if( ema2 <= 7.51723 )
									ret := 0.736842 // buy
								if( ema2 > 7.51723 )
									ret := -0.137500
						if( ema12 > 0.170262 )
							if( ema3 <= 9.79907 )
								if( tema <= 10.1063 )
									ret := 0.574194
								if( tema > 10.1063 )
									ret := -1.000000 // sell
							if( ema3 > 9.79907 )
								if( ema2 <= 10.9565 )
									ret := 0.941176 // buy
								if( ema2 > 10.9565 )
									ret := 0.400000
					if( bbp > 0.870965 )
						if( ema3 <= 9.1411 )
							ret := -0.111111
						if( ema3 > 9.1411 )
							ret := -1.000000 // sell
			if( ema3 > 11.0305 )
				if( ema2 <= 14.2999 )
					if( bbm <= 0.240588 )
						if( bullPower <= 0.023384 )
							if( ema3 <= 13.2971 )
								ret := -1.000000 // sell
							if( ema3 > 13.2971 )
								if( ema3 <= 14.2037 )
									ret := -0.629630
								if( ema3 > 14.2037 )
									ret := -0.941176 // sell
						if( bullPower > 0.023384 )
							if( ema3 <= 11.2992 )
								if( ema12 <= 0.120584 )
									ret := -0.179310
								if( ema12 > 0.120584 )
									ret := 0.633333
							if( ema3 > 11.2992 )
								if( ema1 <= 11.6741 )
									ret := -0.867925 // sell
								if( ema1 > 11.6741 )
									ret := -0.281369
					if( bbm > 0.240588 )
						if( bullPower <= 0.341082 )
							if( bbp <= 0.076151 )
								ret := -0.818182 // sell
							if( bbp > 0.076151 )
								ret := -1.000000 // sell
						if( bullPower > 0.341082 )
							ret := -0.800000 // sell
				if( ema2 > 14.2999 )
					if( ema1 <= 15.3559 )
						if( bearPower <= 0.084817 )
							if( bbm <= 0.092768 )
								if( bbp <= -0.027138 )
									ret := 0.302326
								if( bbp > -0.027138 )
									ret := -0.250000
							if( bbm > 0.092768 )
								if( bearPower <= -0.018309 )
									ret := 0.504274
								if( bearPower > -0.018309 )
									ret := 0.790123 // buy
						if( bearPower > 0.084817 )
							if( ema13 <= 0.141262 )
								ret := -0.375000
							if( ema13 > 0.141262 )
								ret := -0.866667 // sell
					if( ema1 > 15.3559 )
						if( ema3 <= 16.9509 )
							if( ema3 <= 16.5485 )
								if( tema <= 16.0144 )
									ret := -0.830508 // sell
								if( tema > 16.0144 )
									ret := -0.223881
							if( ema3 > 16.5485 )
								if( ema13 <= 0.072356 )
									ret := 0.170543
								if( ema13 > 0.072356 )
									ret := 0.875000 // buy
						if( ema3 > 16.9509 )
							if( ema2 <= 17.0022 )
								if( ema12 <= -0.001598 )
									ret := -0.250000
								if( ema12 > -0.001598 )
									ret := -0.636364
							if( ema2 > 17.0022 )
								if( bullPower <= 0.044966 )
									ret := -0.562500
								if( bullPower > 0.044966 )
									ret := -0.940000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_DOTUSDT_15Min_b988aeae(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


