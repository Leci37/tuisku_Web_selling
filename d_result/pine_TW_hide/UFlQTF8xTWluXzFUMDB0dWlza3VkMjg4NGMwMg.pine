//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: PYPL_1Min_1T00_d2884c02 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_1T00_d2884c02", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_d2884c02(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.003231 )
		if( ema12 <= -0.073687 )
			if( ema3 <= 65.1358 )
				if( ema2 <= 64.9011 )
					if( ema1 <= 64.6832 )
						if( ema12 <= -0.644571 )
							if( ema2 <= 60.6033 )
								ret := -1.000000 // sell
							if( ema2 > 60.6033 )
								ret := 0.500000
						if( ema12 > -0.644571 )
							if( ema2 <= 64.7151 )
								if( ema13 <= -0.622143 )
									ret := 0.964286 // buy
								if( ema13 > -0.622143 )
									ret := 0.268041
							if( ema2 > 64.7151 )
								if( ema1 <= 64.654 )
									ret := 0.906250 // buy
								if( ema1 > 64.654 )
									ret := 0.333333
					if( ema1 > 64.6832 )
						if( tema <= 64.5796 )
							if( ema3 <= 64.9806 )
								ret := 0.428571
							if( ema3 > 64.9806 )
								ret := -1.000000 // sell
						if( tema > 64.5796 )
							if( ema2 <= 64.836 )
								ret := -0.500000
							if( ema2 > 64.836 )
								if( ema3 <= 64.9544 )
									ret := -1.000000 // sell
								if( ema3 > 64.9544 )
									ret := -0.750000 // sell
				if( ema2 > 64.9011 )
					if( tema <= 64.6808 )
						if( ema13 <= -0.305884 )
							ret := 1.000000 // buy
						if( ema13 > -0.305884 )
							if( ema3 <= 65.1067 )
								if( ema12 <= -0.156016 )
									ret := -0.833333 // sell
								if( ema12 > -0.156016 )
									ret := 0.250000
							if( ema3 > 65.1067 )
								ret := 1.000000 // buy
					if( tema > 64.6808 )
						if( ema12 <= -0.083939 )
							if( ema3 <= 65.0563 )
								ret := 0.750000 // buy
							if( ema3 > 65.0563 )
								ret := 1.000000 // buy
						if( ema12 > -0.083939 )
							if( ema2 <= 64.9143 )
								ret := 1.000000 // buy
							if( ema2 > 64.9143 )
								if( ema2 <= 64.977 )
									ret := 0.333333
								if( ema2 > 64.977 )
									ret := 0.750000 // buy
			if( ema3 > 65.1358 )
				if( ema3 <= 69.6646 )
					if( ema12 <= -0.127788 )
						if( ema1 <= 68.0458 )
							if( ema3 <= 67.4811 )
								if( tema <= 66.7103 )
									ret := -0.168539
								if( tema > 66.7103 )
									ret := -0.961538 // sell
							if( ema3 > 67.4811 )
								if( ema3 <= 68.2141 )
									ret := 0.576923
								if( ema3 > 68.2141 )
									ret := 1.000000 // buy
						if( ema1 > 68.0458 )
							if( ema12 <= -0.250808 )
								if( ema2 <= 69.3134 )
									ret := 0.000000
								if( ema2 > 69.3134 )
									ret := 1.000000 // buy
							if( ema12 > -0.250808 )
								if( ema1 <= 68.7027 )
									ret := -0.976744 // sell
								if( ema1 > 68.7027 )
									ret := -0.379310
					if( ema12 > -0.127788 )
						if( tema <= 65.5312 )
							if( ema13 <= -0.231671 )
								if( ema3 <= 65.4406 )
									ret := 1.000000 // buy
								if( ema3 > 65.4406 )
									ret := 0.625000
							if( ema13 > -0.231671 )
								if( ema2 <= 65.6356 )
									ret := -0.391304
								if( ema2 > 65.6356 )
									ret := -1.000000 // sell
						if( tema > 65.5312 )
							if( ema2 <= 66.294 )
								if( ema2 <= 66.038 )
									ret := 0.081967
								if( ema2 > 66.038 )
									ret := 0.700000 // buy
							if( ema2 > 66.294 )
								if( ema1 <= 66.6843 )
									ret := -0.601770
								if( ema1 > 66.6843 )
									ret := 0.097686
				if( ema3 > 69.6646 )
					if( ema2 <= 71.8554 )
						if( ema1 <= 71.0678 )
							if( tema <= 70.154 )
								if( ema13 <= -0.202791 )
									ret := 0.684615
								if( ema13 > -0.202791 )
									ret := 0.101695
							if( tema > 70.154 )
								if( ema13 <= -0.153318 )
									ret := -0.734375 // sell
								if( ema13 > -0.153318 )
									ret := 0.343750
						if( ema1 > 71.0678 )
							if( ema12 <= -0.122046 )
								if( ema13 <= -0.313433 )
									ret := 0.666667
								if( ema13 > -0.313433 )
									ret := 0.880000 // buy
							if( ema12 > -0.122046 )
								if( ema13 <= -0.247527 )
									ret := -0.714286 // sell
								if( ema13 > -0.247527 )
									ret := 0.438272
					if( ema2 > 71.8554 )
						if( ema2 <= 73.7212 )
							if( ema3 <= 73.4575 )
								if( ema1 <= 72.9781 )
									ret := -0.143791
								if( ema1 > 72.9781 )
									ret := 0.650000
							if( ema3 > 73.4575 )
								if( ema2 <= 73.5711 )
									ret := -0.852941 // sell
								if( ema2 > 73.5711 )
									ret := 0.000000
						if( ema2 > 73.7212 )
							if( ema2 <= 80.0378 )
								if( ema13 <= -0.201263 )
									ret := 0.545045
								if( ema13 > -0.201263 )
									ret := 0.148688
							if( ema2 > 80.0378 )
								if( ema2 <= 80.15 )
									ret := -0.794118 // sell
								if( ema2 > 80.15 )
									ret := -0.078014
		if( ema12 > -0.073687 )
			if( ema13 <= -0.027566 )
				if( ema3 <= 57.4268 )
					if( ema12 <= -0.055934 )
						if( ema3 <= 57.3483 )
							ret := 0.000000
						if( ema3 > 57.3483 )
							ret := 0.250000
					if( ema12 > -0.055934 )
						if( ema13 <= -0.035155 )
							if( ema3 <= 57.2471 )
								ret := 1.000000 // buy
							if( ema3 > 57.2471 )
								if( ema1 <= 57.233 )
									ret := 0.500000
								if( ema1 > 57.233 )
									ret := 1.000000 // buy
						if( ema13 > -0.035155 )
							ret := 0.250000
				if( ema3 > 57.4268 )
					if( ema3 <= 57.7782 )
						if( ema13 <= -0.078638 )
							if( ema2 <= 57.718 )
								if( ema12 <= -0.037875 )
									ret := -0.805970 // sell
								if( ema12 > -0.037875 )
									ret := -0.142857
							if( ema2 > 57.718 )
								ret := 0.250000
						if( ema13 > -0.078638 )
							if( ema1 <= 57.4641 )
								if( ema1 <= 57.4396 )
									ret := 0.000000
								if( ema1 > 57.4396 )
									ret := 1.000000 // buy
							if( ema1 > 57.4641 )
								if( ema12 <= -0.016572 )
									ret := -0.088235
								if( ema12 > -0.016572 )
									ret := 0.375000
					if( ema3 > 57.7782 )
						if( tema <= 58.1466 )
							if( ema3 <= 57.9405 )
								if( ema2 <= 57.876 )
									ret := 0.333333
								if( ema2 > 57.876 )
									ret := 0.878788 // buy
							if( ema3 > 57.9405 )
								if( ema2 <= 57.9991 )
									ret := -0.448276
								if( ema2 > 57.9991 )
									ret := 0.261438
						if( tema > 58.1466 )
							if( ema1 <= 60.8028 )
								if( ema12 <= -0.037295 )
									ret := 0.094538
								if( ema12 > -0.037295 )
									ret := -0.083644
							if( ema1 > 60.8028 )
								if( ema3 <= 62.6416 )
									ret := 0.175446
								if( ema3 > 62.6416 )
									ret := 0.043757
			if( ema13 > -0.027566 )
				if( ema12 <= -0.020234 )
					if( ema1 <= 80.7449 )
						if( ema13 <= 0.035417 )
							if( ema12 <= -0.027367 )
								if( ema3 <= 71.7878 )
									ret := 0.452830
								if( ema3 > 71.7878 )
									ret := 0.147541
							if( ema12 > -0.027367 )
								if( ema12 <= -0.027037 )
									ret := -0.368421
								if( ema12 > -0.027037 )
									ret := 0.246377
						if( ema13 > 0.035417 )
							if( ema2 <= 70.6868 )
								if( ema12 <= -0.034297 )
									ret := -0.500000
								if( ema12 > -0.034297 )
									ret := 0.200000
							if( ema2 > 70.6868 )
								ret := -1.000000 // sell
					if( ema1 > 80.7449 )
						if( ema12 <= -0.023181 )
							if( ema2 <= 81.7085 )
								ret := 0.000000
							if( ema2 > 81.7085 )
								ret := -0.750000 // sell
						if( ema12 > -0.023181 )
							ret := -0.857143 // sell
				if( ema12 > -0.020234 )
					if( tema <= 59.3478 )
						if( tema <= 59.2645 )
							if( tema <= 57.2808 )
								if( ema3 <= 57.3157 )
									ret := 1.000000 // buy
								if( ema3 > 57.3157 )
									ret := 0.800000 // buy
							if( tema > 57.2808 )
								if( ema3 <= 59.2925 )
									ret := 0.169342
								if( ema3 > 59.2925 )
									ret := -0.777778 // sell
						if( tema > 59.2645 )
							if( ema3 <= 59.3572 )
								if( ema2 <= 59.3261 )
									ret := 0.444444
								if( ema2 > 59.3261 )
									ret := 0.837209 // buy
							if( ema3 > 59.3572 )
								if( ema1 <= 59.3665 )
									ret := -0.200000
								if( ema1 > 59.3665 )
									ret := 0.666667
					if( tema > 59.3478 )
						if( ema1 <= 64.9152 )
							if( ema13 <= 0.001994 )
								if( ema2 <= 59.7523 )
									ret := -0.148855
								if( ema2 > 59.7523 )
									ret := 0.041010
							if( ema13 > 0.001994 )
								if( ema1 <= 64.6294 )
									ret := 0.271552
								if( ema1 > 64.6294 )
									ret := -0.390244
						if( ema1 > 64.9152 )
							if( tema <= 65.7757 )
								if( tema <= 65.1173 )
									ret := 0.544643
								if( tema > 65.1173 )
									ret := 0.273006
							if( tema > 65.7757 )
								if( ema3 <= 66.5269 )
									ret := -0.144000
								if( ema3 > 66.5269 )
									ret := 0.113344
	if( ema12 > -0.003231 )
		if( ema12 <= 0.055015 )
			if( ema2 <= 64.9592 )
				if( tema <= 64.9955 )
					if( ema13 <= 0.067993 )
						if( ema2 <= 57.7805 )
							if( ema1 <= 57.5343 )
								if( ema1 <= 57.2933 )
									ret := 0.571429
								if( ema1 > 57.2933 )
									ret := -0.229508
							if( ema1 > 57.5343 )
								if( ema12 <= -0.001434 )
									ret := -0.083333
								if( ema12 > -0.001434 )
									ret := 0.529412
						if( ema2 > 57.7805 )
							if( ema1 <= 57.8348 )
								if( ema3 <= 57.7726 )
									ret := 0.400000
								if( ema3 > 57.7726 )
									ret := -0.833333 // sell
							if( ema1 > 57.8348 )
								if( ema3 <= 63.384 )
									ret := 0.006064
								if( ema3 > 63.384 )
									ret := -0.057130
					if( ema13 > 0.067993 )
						if( tema <= 58.3217 )
							if( ema2 <= 58.1182 )
								if( ema2 <= 57.7347 )
									ret := 0.641026
								if( ema2 > 57.7347 )
									ret := -0.096154
							if( ema2 > 58.1182 )
								if( ema13 <= 0.070878 )
									ret := 0.300000
								if( ema13 > 0.070878 )
									ret := 0.948718 // buy
						if( tema > 58.3217 )
							if( ema2 <= 58.4886 )
								if( ema1 <= 58.3964 )
									ret := -0.250000
								if( ema1 > 58.3964 )
									ret := -0.647059
							if( ema2 > 58.4886 )
								if( ema1 <= 58.9177 )
									ret := 0.453704
								if( ema1 > 58.9177 )
									ret := 0.093606
				if( tema > 64.9955 )
					if( ema3 <= 64.9084 )
						if( ema13 <= 0.068139 )
							ret := 0.142857
						if( ema13 > 0.068139 )
							if( ema2 <= 64.9264 )
								ret := -1.000000 // sell
							if( ema2 > 64.9264 )
								if( ema2 <= 64.9333 )
									ret := 0.000000
								if( ema2 > 64.9333 )
									ret := -0.666667
					if( ema3 > 64.9084 )
						if( ema3 <= 64.9459 )
							if( tema <= 65.03 )
								if( ema12 <= 0.030666 )
									ret := -0.863636 // sell
								if( ema12 > 0.030666 )
									ret := -0.400000
							if( tema > 65.03 )
								ret := -1.000000 // sell
						if( ema3 > 64.9459 )
							ret := -0.250000
			if( ema2 > 64.9592 )
				if( tema <= 81.6112 )
					if( ema1 <= 64.9836 )
						if( ema12 <= 0.006225 )
							if( ema1 <= 64.9664 )
								ret := 0.000000
							if( ema1 > 64.9664 )
								ret := -0.250000
						if( ema12 > 0.006225 )
							if( ema3 <= 64.9468 )
								if( tema <= 64.9814 )
									ret := 0.000000
								if( tema > 64.9814 )
									ret := 0.750000 // buy
							if( ema3 > 64.9468 )
								if( ema2 <= 64.9728 )
									ret := 0.967742 // buy
								if( ema2 > 64.9728 )
									ret := 0.500000
					if( ema1 > 64.9836 )
						if( ema2 <= 81.4314 )
							if( ema3 <= 78.4323 )
								if( ema2 <= 78.3309 )
									ret := 0.073002
								if( ema2 > 78.3309 )
									ret := 0.392523
							if( ema3 > 78.4323 )
								if( ema13 <= 0.041111 )
									ret := -0.090372
								if( ema13 > 0.041111 )
									ret := 0.099765
						if( ema2 > 81.4314 )
							if( ema2 <= 81.5625 )
								if( ema12 <= 0.045477 )
									ret := 1.000000 // buy
								if( ema12 > 0.045477 )
									ret := 0.750000 // buy
							if( ema2 > 81.5625 )
								if( ema12 <= 0.001086 )
									ret := 0.600000
								if( ema12 > 0.001086 )
									ret := 0.000000
				if( tema > 81.6112 )
					if( ema3 <= 81.7223 )
						if( tema <= 81.6182 )
							ret := -1.000000 // sell
						if( tema > 81.6182 )
							if( ema13 <= 0.013325 )
								ret := 0.000000
							if( ema13 > 0.013325 )
								if( ema13 <= 0.025927 )
									ret := -0.571429
								if( ema13 > 0.025927 )
									ret := -0.117647
					if( ema3 > 81.7223 )
						if( ema12 <= 0.010366 )
							ret := -1.000000 // sell
						if( ema12 > 0.010366 )
							ret := -0.500000
		if( ema12 > 0.055015 )
			if( ema2 <= 78.6822 )
				if( ema3 <= 77.8202 )
					if( ema12 <= 0.169888 )
						if( tema <= 77.9061 )
							if( ema2 <= 69.6615 )
								if( tema <= 69.7156 )
									ret := -0.110541
								if( tema > 69.7156 )
									ret := -0.825000 // sell
							if( ema2 > 69.6615 )
								if( ema12 <= 0.094402 )
									ret := 0.101642
								if( ema12 > 0.094402 )
									ret := -0.198502
						if( tema > 77.9061 )
							if( tema <= 78.0427 )
								if( ema2 <= 77.7669 )
									ret := 0.722222 // buy
								if( ema2 > 77.7669 )
									ret := 0.961538 // buy
							if( tema > 78.0427 )
								if( ema2 <= 77.8917 )
									ret := 0.100000
								if( ema2 > 77.8917 )
									ret := 1.000000 // buy
					if( ema12 > 0.169888 )
						if( tema <= 60.0922 )
							if( ema13 <= 0.437207 )
								if( ema12 <= 0.1889 )
									ret := -0.200000
								if( ema12 > 0.1889 )
									ret := -0.846154 // sell
							if( ema13 > 0.437207 )
								if( tema <= 59.6969 )
									ret := 0.600000
								if( tema > 59.6969 )
									ret := 0.000000
						if( tema > 60.0922 )
							if( ema2 <= 61.6067 )
								if( ema1 <= 59.6855 )
									ret := -1.000000 // sell
								if( ema1 > 59.6855 )
									ret := 0.617391
							if( ema2 > 61.6067 )
								if( ema2 <= 64.0811 )
									ret := -0.184713
								if( ema2 > 64.0811 )
									ret := 0.232075
				if( ema3 > 77.8202 )
					if( ema13 <= 0.127754 )
						if( ema12 <= 0.064367 )
							if( tema <= 78.4209 )
								if( ema1 <= 78.0177 )
									ret := 0.000000
								if( ema1 > 78.0177 )
									ret := -0.473684
							if( tema > 78.4209 )
								if( ema1 <= 78.4298 )
									ret := 0.800000 // buy
								if( ema1 > 78.4298 )
									ret := 0.000000
						if( ema12 > 0.064367 )
							if( ema12 <= 0.067913 )
								if( tema <= 78.5602 )
									ret := -0.600000
								if( tema > 78.5602 )
									ret := -1.000000 // sell
							if( ema12 > 0.067913 )
								if( ema12 <= 0.076209 )
									ret := -0.235294
								if( ema12 > 0.076209 )
									ret := -0.857143 // sell
					if( ema13 > 0.127754 )
						if( tema <= 78.432 )
							if( ema2 <= 78.1019 )
								if( ema13 <= 0.134858 )
									ret := -0.200000
								if( ema13 > 0.134858 )
									ret := -0.740741 // sell
							if( ema2 > 78.1019 )
								if( ema12 <= 0.077689 )
									ret := 0.583333
								if( ema12 > 0.077689 )
									ret := -0.333333
						if( tema > 78.432 )
							if( ema1 <= 78.7578 )
								if( tema <= 78.5385 )
									ret := -0.742857 // sell
								if( tema > 78.5385 )
									ret := -0.910448 // sell
							if( ema1 > 78.7578 )
								ret := -0.250000
			if( ema2 > 78.6822 )
				if( tema <= 79.3402 )
					if( ema12 <= 0.083384 )
						if( ema3 <= 79.0492 )
							if( tema <= 79.2291 )
								if( ema12 <= 0.067151 )
									ret := 0.250000
								if( ema12 > 0.067151 )
									ret := 0.600000
							if( tema > 79.2291 )
								if( ema3 <= 79.0244 )
									ret := -0.750000 // sell
								if( ema3 > 79.0244 )
									ret := 0.333333
						if( ema3 > 79.0492 )
							if( tema <= 79.2741 )
								if( ema12 <= 0.057466 )
									ret := 0.250000
								if( ema12 > 0.057466 )
									ret := 0.944444 // buy
							if( tema > 79.2741 )
								if( ema3 <= 79.0886 )
									ret := 0.000000
								if( ema3 > 79.0886 )
									ret := 0.600000
					if( ema12 > 0.083384 )
						ret := 1.000000 // buy
				if( tema > 79.3402 )
					if( ema2 <= 79.629 )
						if( ema3 <= 79.4035 )
							if( ema1 <= 79.3291 )
								if( tema <= 79.3903 )
									ret := 0.035714
								if( tema > 79.3903 )
									ret := -0.760000 // sell
							if( ema1 > 79.3291 )
								if( ema12 <= 0.110477 )
									ret := 0.666667
								if( ema12 > 0.110477 )
									ret := -0.300000
						if( ema3 > 79.4035 )
							if( ema2 <= 79.5914 )
								if( ema13 <= 0.205996 )
									ret := -1.000000 // sell
								if( ema13 > 0.205996 )
									ret := -0.800000 // sell
							if( ema2 > 79.5914 )
								ret := -0.500000
					if( ema2 > 79.629 )
						if( tema <= 79.9682 )
							if( ema13 <= 0.154774 )
								ret := 1.000000 // buy
							if( ema13 > 0.154774 )
								ret := 0.833333 // buy
						if( tema > 79.9682 )
							if( ema2 <= 80.411 )
								if( ema1 <= 80.1067 )
									ret := -0.102564
								if( ema1 > 80.1067 )
									ret := 0.430556
							if( ema2 > 80.411 )
								if( ema3 <= 80.9481 )
									ret := -0.287671
								if( ema3 > 80.9481 )
									ret := 0.240741
	
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
float op_operation = decision_tree_0_PYPL_1Min_d2884c02(ema12, ema3, ema13, tema, ema1, ema2)

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


