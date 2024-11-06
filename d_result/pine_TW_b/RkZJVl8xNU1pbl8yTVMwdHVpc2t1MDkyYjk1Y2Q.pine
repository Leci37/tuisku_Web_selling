//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: FFIV_15Min_2MS0_092b95cd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_15Min_2MS0_092b95cd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_15Min_092b95cd(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow_Sum <= 6.41923e+07 )
		if( Negative_Money_Flow <= 1.15560e+07 )
			if( Typical_Price <= 143.62 )
				if( Negative_Money_Flow_Sum <= 6.7007e+06 )
					if( d <= 93.5066 )
						if( MFI_Low <= 65.5916 )
							if( Positive_Money_Flow_Sum <= 2.64767e+06 )
								if( Positive_Money_Flow <= 48010.3 )
									ret := 0.895833 // buy
								if( Positive_Money_Flow > 48010.3 )
									ret := -0.333333
							if( Positive_Money_Flow_Sum > 2.64767e+06 )
								if( Positive_Money_Flow_Sum <= 6.51378e+06 )
									ret := -0.093220
								if( Positive_Money_Flow_Sum > 6.51378e+06 )
									ret := 0.221250
						if( MFI_Low > 65.5916 )
							if( MFI <= 95.4265 )
								if( Negative_Money_Flow <= 392620 )
									ret := 0.607143
								if( Negative_Money_Flow > 392620 )
									ret := 0.139241
							if( MFI > 95.4265 )
								if( d <= 69.3683 )
									ret := -0.444444
								if( d > 69.3683 )
									ret := 0.377778
					if( d > 93.5066 )
						if( Money_Flow_Ratio <= 10.6863 )
							if( Positive_Money_Flow <= 1.47667e+06 )
								if( Typical_Price <= 141.118 )
									ret := -0.216000
								if( Typical_Price > 141.118 )
									ret := 0.275000
							if( Positive_Money_Flow > 1.47667e+06 )
								if( Negative_Money_Flow_Sum <= 4.16366e+06 )
									ret := 0.571429
								if( Negative_Money_Flow_Sum > 4.16366e+06 )
									ret := 0.142857
						if( Money_Flow_Ratio > 10.6863 )
							if( Positive_Money_Flow <= 3.48811e+06 )
								if( MFI_Low <= 72.0646 )
									ret := -0.666667
								if( MFI_Low > 72.0646 )
									ret := 0.040816
							if( Positive_Money_Flow > 3.48811e+06 )
								if( Typical_Price <= 129.244 )
									ret := -0.250000
								if( Typical_Price > 129.244 )
									ret := -0.809524 // sell
				if( Negative_Money_Flow_Sum > 6.7007e+06 )
					if( MFI <= 18.3464 )
						if( rsi1 <= 33.9051 )
							if( Negative_Money_Flow_Sum <= 4.97811e+07 )
								if( smoothD_d <= 14.571 )
									ret := -0.015723
								if( smoothD_d > 14.571 )
									ret := 0.429630
							if( Negative_Money_Flow_Sum > 4.97811e+07 )
								if( d_k <= -0.796086 )
									ret := -0.044944
								if( d_k > -0.796086 )
									ret := -0.420000
						if( rsi1 > 33.9051 )
							if( Negative_Money_Flow_Sum <= 5.92512e+07 )
								if( Typical_Price <= 100.633 )
									ret := 1.000000 // buy
								if( Typical_Price > 100.633 )
									ret := -0.422764
							if( Negative_Money_Flow_Sum > 5.92512e+07 )
								if( Raw_Money_Flow <= 1.55831e+06 )
									ret := -0.240000
								if( Raw_Money_Flow > 1.55831e+06 )
									ret := 0.714286 // buy
					if( MFI > 18.3464 )
						if( Positive_Money_Flow <= 2.99044e+07 )
							if( Typical_Price <= 90.5387 )
								if( Raw_Money_Flow <= 4.17541e+06 )
									ret := 0.960000 // buy
								if( Raw_Money_Flow > 4.17541e+06 )
									ret := 0.300000
							if( Typical_Price > 90.5387 )
								if( Positive_Money_Flow_Sum <= 1.10711e+07 )
									ret := 0.002610
								if( Positive_Money_Flow_Sum > 1.10711e+07 )
									ret := 0.075665
						if( Positive_Money_Flow > 2.99044e+07 )
							if( Positive_Money_Flow_Sum <= 5.79118e+07 )
								if( rsi1 <= 30.977 )
									ret := 1.000000 // buy
								if( rsi1 > 30.977 )
									ret := -0.277778
							if( Positive_Money_Flow_Sum > 5.79118e+07 )
								if( Positive_Money_Flow_Sum <= 1.21307e+08 )
									ret := 0.796875 // buy
								if( Positive_Money_Flow_Sum > 1.21307e+08 )
									ret := 0.142857
			if( Typical_Price > 143.62 )
				if( Positive_Money_Flow_Sum <= 4.13768e+07 )
					if( Positive_Money_Flow_Sum <= 3.31822e+07 )
						if( Raw_Money_Flow <= 167017 )
							if( Negative_Money_Flow_Sum <= 3.51391e+07 )
								if( d_k <= 5.21805 )
									ret := -0.112676
								if( d_k > 5.21805 )
									ret := 0.303279
							if( Negative_Money_Flow_Sum > 3.51391e+07 )
								if( d_k <= -5.79919 )
									ret := -0.048387
								if( d_k > -5.79919 )
									ret := 0.560166
						if( Raw_Money_Flow > 167017 )
							if( Positive_Money_Flow_Sum <= 4.10198e+06 )
								if( MFI_Low <= 10.0921 )
									ret := -0.023279
								if( MFI_Low > 10.0921 )
									ret := -0.256236
							if( Positive_Money_Flow_Sum > 4.10198e+06 )
								if( Negative_Money_Flow <= 1.12367e+07 )
									ret := 0.020084
								if( Negative_Money_Flow > 1.12367e+07 )
									ret := -0.606061
					if( Positive_Money_Flow_Sum > 3.31822e+07 )
						if( MFI_Low <= 69.8955 )
							if( d <= 51.2332 )
								if( Negative_Money_Flow_Sum <= 1.12134e+07 )
									ret := 0.284507
								if( Negative_Money_Flow_Sum > 1.12134e+07 )
									ret := -0.044359
							if( d > 51.2332 )
								if( rsi1 <= 65.684 )
									ret := 0.276233
								if( rsi1 > 65.684 )
									ret := 0.052562
						if( MFI_Low > 69.8955 )
							if( Raw_Money_Flow <= 3.30898e+06 )
								if( Raw_Money_Flow <= 838175 )
									ret := 0.160000
								if( Raw_Money_Flow > 838175 )
									ret := -0.602941
							if( Raw_Money_Flow > 3.30898e+06 )
								if( Positive_Money_Flow <= 1.89636e+07 )
									ret := 0.500000
								if( Positive_Money_Flow > 1.89636e+07 )
									ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 4.13768e+07 )
					if( Typical_Price <= 200.252 )
						if( Positive_Money_Flow_Sum <= 4.24001e+07 )
							if( Negative_Money_Flow_Sum <= 1.54533e+07 )
								if( Negative_Money_Flow <= 92705.5 )
									ret := -0.185567
								if( Negative_Money_Flow > 92705.5 )
									ret := 0.265306
							if( Negative_Money_Flow_Sum > 1.54533e+07 )
								if( Money_Flow_Ratio <= 0.741983 )
									ret := 0.666667
								if( Money_Flow_Ratio > 0.741983 )
									ret := -0.524752
						if( Positive_Money_Flow_Sum > 4.24001e+07 )
							if( MFI_Low <= 72.6804 )
								if( rsi1 <= 27.027 )
									ret := -0.247826
								if( rsi1 > 27.027 )
									ret := 0.006357
							if( MFI_Low > 72.6804 )
								if( d <= 93.9398 )
									ret := 0.359338
								if( d > 93.9398 )
									ret := -0.186667
					if( Typical_Price > 200.252 )
						if( MFI_High <= -18.5842 )
							if( rsi1 <= 40.9592 )
								if( Raw_Money_Flow <= 3.98705e+06 )
									ret := -0.235294
								if( Raw_Money_Flow > 3.98705e+06 )
									ret := 0.736842 // buy
							if( rsi1 > 40.9592 )
								if( rsi1 <= 77.7445 )
									ret := -0.727941 // sell
								if( rsi1 > 77.7445 )
									ret := -0.083333
						if( MFI_High > -18.5842 )
							if( Positive_Money_Flow_Sum <= 1.09554e+08 )
								if( smoothK_k <= 80.0281 )
									ret := -0.029371
								if( smoothK_k > 80.0281 )
									ret := -0.313492
							if( Positive_Money_Flow_Sum > 1.09554e+08 )
								if( d_k <= 21.2587 )
									ret := -0.516484
								if( d_k > 21.2587 )
									ret := 0.833333 // buy
		if( Negative_Money_Flow > 1.15560e+07 )
			if( Raw_Money_Flow <= 3.04292e+07 )
				if( rsi1 <= 20.6254 )
					if( MFI_High <= -34.6653 )
						if( k <= 38.9575 )
							if( smoothD_d <= -1.81614 )
								ret := -0.166667
							if( smoothD_d > -1.81614 )
								if( Negative_Money_Flow_Sum <= 5.24749e+07 )
									ret := 0.833333 // buy
								if( Negative_Money_Flow_Sum > 5.24749e+07 )
									ret := 0.560000
						if( k > 38.9575 )
							ret := -0.400000
					if( MFI_High > -34.6653 )
						ret := -0.666667
				if( rsi1 > 20.6254 )
					if( Positive_Money_Flow_Sum <= 5.5543e+07 )
						if( Typical_Price <= 118.595 )
							if( MFI_Low <= -1.72619 )
								ret := 0.000000
							if( MFI_Low > -1.72619 )
								if( d_k <= -0.462402 )
									ret := 0.250000
								if( d_k > -0.462402 )
									ret := 0.882353 // buy
						if( Typical_Price > 118.595 )
							if( d_k <= 22.069 )
								if( d_k <= 0.911408 )
									ret := 0.229904
								if( d_k > 0.911408 )
									ret := 0.097450
							if( d_k > 22.069 )
								if( Typical_Price <= 124.148 )
									ret := -0.200000
								if( Typical_Price > 124.148 )
									ret := 0.620000
					if( Positive_Money_Flow_Sum > 5.5543e+07 )
						if( Negative_Money_Flow <= 1.79148e+07 )
							if( rsi1 <= 39.9395 )
								ret := -1.000000 // sell
							if( rsi1 > 39.9395 )
								if( Money_Flow_Ratio <= 2.9043 )
									ret := 0.190476
								if( Money_Flow_Ratio > 2.9043 )
									ret := 0.850000 // buy
						if( Negative_Money_Flow > 1.79148e+07 )
							if( Positive_Money_Flow_Sum <= 8.66782e+07 )
								if( rsi1 <= 80.9002 )
									ret := 1.000000 // buy
								if( rsi1 > 80.9002 )
									ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 8.66782e+07 )
								ret := 0.333333
			if( Raw_Money_Flow > 3.04292e+07 )
				if( Positive_Money_Flow_Sum <= 1.11363e+07 )
					if( smoothK_k <= 3.73217 )
						ret := -0.500000
					if( smoothK_k > 3.73217 )
						if( Negative_Money_Flow_Sum <= 6.10456e+07 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 6.10456e+07 )
							ret := -0.750000 // sell
				if( Positive_Money_Flow_Sum > 1.11363e+07 )
					if( Money_Flow_Ratio <= 0.822257 )
						if( Negative_Money_Flow <= 3.08125e+07 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow > 3.08125e+07 )
							if( Positive_Money_Flow_Sum <= 3.01545e+07 )
								if( d_k <= 8.22678 )
									ret := -0.195652
								if( d_k > 8.22678 )
									ret := 0.578947
							if( Positive_Money_Flow_Sum > 3.01545e+07 )
								if( Positive_Money_Flow_Sum <= 3.90989e+07 )
									ret := 0.909091 // buy
								if( Positive_Money_Flow_Sum > 3.90989e+07 )
									ret := 0.000000
					if( Money_Flow_Ratio > 0.822257 )
						if( Typical_Price <= 169.928 )
							if( smoothK_k <= 86.1852 )
								ret := -1.000000 // sell
							if( smoothK_k > 86.1852 )
								ret := -0.750000 // sell
						if( Typical_Price > 169.928 )
							ret := -0.142857
	if( Negative_Money_Flow_Sum > 6.41923e+07 )
		if( Negative_Money_Flow_Sum <= 2.10179e+08 )
			if( smoothD_d <= 45.0269 )
				if( Typical_Price <= 203.512 )
					if( smoothD_d <= 4.74203 )
						if( MFI <= 10.6426 )
							if( Positive_Money_Flow_Sum <= 1.39145e+07 )
								if( Positive_Money_Flow_Sum <= 4.25235e+06 )
									ret := 0.191489
								if( Positive_Money_Flow_Sum > 4.25235e+06 )
									ret := 0.488038
							if( Positive_Money_Flow_Sum > 1.39145e+07 )
								ret := -1.000000 // sell
						if( MFI > 10.6426 )
							if( Raw_Money_Flow <= 3.33555e+06 )
								if( MFI <= 59.2103 )
									ret := -0.348659
								if( MFI > 59.2103 )
									ret := 0.857143 // buy
							if( Raw_Money_Flow > 3.33555e+06 )
								if( MFI_Low <= 29.8248 )
									ret := 0.253906
								if( MFI_Low > 29.8248 )
									ret := -0.689655
					if( smoothD_d > 4.74203 )
						if( d_k <= -10.1298 )
							if( Positive_Money_Flow_Sum <= 2.47864e+07 )
								if( Negative_Money_Flow_Sum <= 1.52118e+08 )
									ret := -0.150000
								if( Negative_Money_Flow_Sum > 1.52118e+08 )
									ret := 0.714286 // buy
							if( Positive_Money_Flow_Sum > 2.47864e+07 )
								if( Positive_Money_Flow_Sum <= 4.07521e+07 )
									ret := 0.578431
								if( Positive_Money_Flow_Sum > 4.07521e+07 )
									ret := -0.178082
						if( d_k > -10.1298 )
							if( Typical_Price <= 155.79 )
								if( MFI_High <= -65.3788 )
									ret := 0.210526
								if( MFI_High > -65.3788 )
									ret := 0.449918
							if( Typical_Price > 155.79 )
								if( rsi1 <= 25.7583 )
									ret := -0.011029
								if( rsi1 > 25.7583 )
									ret := 0.284483
				if( Typical_Price > 203.512 )
					if( rsi1 <= 34.0029 )
						if( Positive_Money_Flow <= 915437 )
							if( smoothD_d <= -0.999677 )
								if( Positive_Money_Flow_Sum <= 1.68981e+07 )
									ret := -0.222222
								if( Positive_Money_Flow_Sum > 1.68981e+07 )
									ret := -1.000000 // sell
							if( smoothD_d > -0.999677 )
								if( Positive_Money_Flow_Sum <= 2.12053e+07 )
									ret := 0.561644
								if( Positive_Money_Flow_Sum > 2.12053e+07 )
									ret := 0.000000
						if( Positive_Money_Flow > 915437 )
							if( Raw_Money_Flow <= 2.78892e+06 )
								if( MFI <= 11.1661 )
									ret := -0.714286 // sell
								if( MFI > 11.1661 )
									ret := 0.000000
							if( Raw_Money_Flow > 2.78892e+06 )
								if( Negative_Money_Flow_Sum <= 1.14236e+08 )
									ret := -0.785714 // sell
								if( Negative_Money_Flow_Sum > 1.14236e+08 )
									ret := -0.250000
					if( rsi1 > 34.0029 )
						if( Positive_Money_Flow_Sum <= 2.7403e+07 )
							if( Negative_Money_Flow_Sum <= 1.02285e+08 )
								if( d_k <= 10.819 )
									ret := -0.063492
								if( d_k > 10.819 )
									ret := 0.769231 // buy
							if( Negative_Money_Flow_Sum > 1.02285e+08 )
								if( d_k <= -1.3763 )
									ret := -0.750000 // sell
								if( d_k > -1.3763 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 2.7403e+07 )
							if( d_k <= 6.67839 )
								if( Raw_Money_Flow <= 1.39235e+07 )
									ret := -0.267857
								if( Raw_Money_Flow > 1.39235e+07 )
									ret := -0.800000 // sell
							if( d_k > 6.67839 )
								if( d_k <= 14.6855 )
									ret := -0.916667 // sell
								if( d_k > 14.6855 )
									ret := -0.250000
			if( smoothD_d > 45.0269 )
				if( MFI_High <= -68.3997 )
					if( Negative_Money_Flow_Sum <= 1.31762e+08 )
						if( Positive_Money_Flow_Sum <= 1.14672e+07 )
							if( Positive_Money_Flow <= 2113.3 )
								if( Negative_Money_Flow_Sum <= 9.65903e+07 )
									ret := -0.128205
								if( Negative_Money_Flow_Sum > 9.65903e+07 )
									ret := -0.650000
							if( Positive_Money_Flow > 2113.3 )
								if( Negative_Money_Flow_Sum <= 9.29935e+07 )
									ret := -0.812500 // sell
								if( Negative_Money_Flow_Sum > 9.29935e+07 )
									ret := -0.300000
						if( Positive_Money_Flow_Sum > 1.14672e+07 )
							if( Negative_Money_Flow_Sum <= 1.03095e+08 )
								ret := 0.714286 // buy
							if( Negative_Money_Flow_Sum > 1.03095e+08 )
								if( Positive_Money_Flow_Sum <= 1.35506e+07 )
									ret := -0.600000
								if( Positive_Money_Flow_Sum > 1.35506e+07 )
									ret := 0.285714
					if( Negative_Money_Flow_Sum > 1.31762e+08 )
						if( Typical_Price <= 185.908 )
							if( Raw_Money_Flow <= 4.74416e+06 )
								if( d_k <= 3.10807 )
									ret := 0.071429
								if( d_k > 3.10807 )
									ret := 0.800000 // buy
							if( Raw_Money_Flow > 4.74416e+06 )
								ret := 1.000000 // buy
						if( Typical_Price > 185.908 )
							if( rsi1 <= 44.6677 )
								if( Positive_Money_Flow_Sum <= 4.78221e+06 )
									ret := -0.166667
								if( Positive_Money_Flow_Sum > 4.78221e+06 )
									ret := -1.000000 // sell
							if( rsi1 > 44.6677 )
								ret := 0.600000
				if( MFI_High > -68.3997 )
					if( Positive_Money_Flow_Sum <= 7.91717e+07 )
						if( Money_Flow_Ratio <= 0.35674 )
							if( Negative_Money_Flow <= 4.22338e+07 )
								if( Negative_Money_Flow_Sum <= 9.91749e+07 )
									ret := 0.048443
								if( Negative_Money_Flow_Sum > 9.91749e+07 )
									ret := -0.207792
							if( Negative_Money_Flow > 4.22338e+07 )
								if( MFI_Low <= -0.94502 )
									ret := 0.714286 // buy
								if( MFI_Low > -0.94502 )
									ret := -0.222222
						if( Money_Flow_Ratio > 0.35674 )
							if( Positive_Money_Flow_Sum <= 4.24836e+07 )
								if( Typical_Price <= 168.386 )
									ret := 0.539906
								if( Typical_Price > 168.386 )
									ret := 0.258503
							if( Positive_Money_Flow_Sum > 4.24836e+07 )
								if( MFI <= 43.9907 )
									ret := -0.106061
								if( MFI > 43.9907 )
									ret := 0.466667
					if( Positive_Money_Flow_Sum > 7.91717e+07 )
						if( Typical_Price <= 135.8 )
							if( Positive_Money_Flow_Sum <= 1.50281e+08 )
								if( d_k <= 5.87035 )
									ret := 1.000000 // buy
								if( d_k > 5.87035 )
									ret := 0.500000
							if( Positive_Money_Flow_Sum > 1.50281e+08 )
								if( Negative_Money_Flow <= 6.62811e+06 )
									ret := -0.500000
								if( Negative_Money_Flow > 6.62811e+06 )
									ret := 0.000000
						if( Typical_Price > 135.8 )
							if( k <= 57.0162 )
								if( Typical_Price <= 194.489 )
									ret := -0.233333
								if( Typical_Price > 194.489 )
									ret := 0.933333 // buy
							if( k > 57.0162 )
								if( rsi1 <= 57.7326 )
									ret := -0.068493
								if( rsi1 > 57.7326 )
									ret := -0.765432 // sell
		if( Negative_Money_Flow_Sum > 2.10179e+08 )
			if( Positive_Money_Flow_Sum <= 7.57095e+07 )
				if( rsi1 <= 48.4125 )
					if( Positive_Money_Flow_Sum <= 2.1507e+07 )
						if( d_k <= 6.13288 )
							if( Positive_Money_Flow <= 1.07435e+06 )
								if( smoothD_d <= 46.5308 )
									ret := 0.969697 // buy
								if( smoothD_d > 46.5308 )
									ret := 0.777778 // buy
							if( Positive_Money_Flow > 1.07435e+06 )
								ret := 0.500000
						if( d_k > 6.13288 )
							ret := 0.200000
					if( Positive_Money_Flow_Sum > 2.1507e+07 )
						if( k <= 15.1563 )
							if( Typical_Price <= 154.623 )
								ret := 1.000000 // buy
							if( Typical_Price > 154.623 )
								ret := 0.333333
						if( k > 15.1563 )
							if( Typical_Price <= 169.034 )
								ret := 0.666667
							if( Typical_Price > 169.034 )
								if( Negative_Money_Flow_Sum <= 3.03294e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 3.03294e+08 )
									ret := 0.000000
				if( rsi1 > 48.4125 )
					if( smoothD_d <= 42.6836 )
						if( Raw_Money_Flow <= 1.82032e+06 )
							ret := 0.000000
						if( Raw_Money_Flow > 1.82032e+06 )
							if( Positive_Money_Flow <= 2.12378e+06 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow > 2.12378e+06 )
								ret := -0.714286 // sell
					if( smoothD_d > 42.6836 )
						if( Raw_Money_Flow <= 1.01374e+06 )
							if( MFI_High <= -71.1785 )
								ret := 0.250000
							if( MFI_High > -71.1785 )
								ret := 1.000000 // buy
						if( Raw_Money_Flow > 1.01374e+06 )
							if( rsi1 <= 78.6843 )
								if( Positive_Money_Flow <= 1.99072e+06 )
									ret := -0.100000
								if( Positive_Money_Flow > 1.99072e+06 )
									ret := 0.666667
							if( rsi1 > 78.6843 )
								ret := -0.750000 // sell
			if( Positive_Money_Flow_Sum > 7.57095e+07 )
				if( Negative_Money_Flow <= 3.96368e+07 )
					if( Positive_Money_Flow <= 3.86223e+06 )
						if( Negative_Money_Flow <= 9812.5 )
							ret := -0.800000 // sell
						if( Negative_Money_Flow > 9812.5 )
							if( Negative_Money_Flow_Sum <= 2.34571e+08 )
								if( d_k <= 0.801624 )
									ret := 0.818182 // buy
								if( d_k > 0.801624 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 2.34571e+08 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow > 3.86223e+06 )
						if( d_k <= -6.19628 )
							if( smoothK_k <= 39.0308 )
								ret := 0.500000
							if( smoothK_k > 39.0308 )
								ret := 1.000000 // buy
						if( d_k > -6.19628 )
							ret := 1.000000 // buy
				if( Negative_Money_Flow > 3.96368e+07 )
					ret := -0.333333
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_FFIV_15Min_092b95cd(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


