//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: U_1Min_1M00_e06cbef6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_1M00_e06cbef6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_e06cbef6(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Positive_Money_Flow <= 1.05614 )
		if( MFI_High <= -63.4882 )
			if( Negative_Money_Flow_Sum <= 710326 )
				if( Negative_Money_Flow_Sum <= 294603 )
					if( Typical_Price <= 25.0819 )
						if( Negative_Money_Flow_Sum <= 222468 )
							if( Positive_Money_Flow_Sum <= 16404.9 )
								if( Typical_Price <= 21.4436 )
									ret := 0.430939
								if( Typical_Price > 21.4436 )
									ret := -0.542857
							if( Positive_Money_Flow_Sum > 16404.9 )
								if( Negative_Money_Flow <= 304.345 )
									ret := 0.288889
								if( Negative_Money_Flow > 304.345 )
									ret := 0.560150
						if( Negative_Money_Flow_Sum > 222468 )
							if( MFI_Low <= -4.32608 )
								if( Negative_Money_Flow <= 13530.6 )
									ret := 0.256757
								if( Negative_Money_Flow > 13530.6 )
									ret := -0.169492
							if( MFI_Low > -4.32608 )
								if( Typical_Price <= 18.1422 )
									ret := -0.818182 // sell
								if( Typical_Price > 18.1422 )
									ret := -0.250000
					if( Typical_Price > 25.0819 )
						ret := -0.700000 // sell
				if( Negative_Money_Flow_Sum > 294603 )
					if( Negative_Money_Flow_Sum <= 377733 )
						if( Negative_Money_Flow <= 44540.8 )
							if( Raw_Money_Flow <= 30305.4 )
								if( MFI_High <= -70.5288 )
									ret := 0.550000
								if( MFI_High > -70.5288 )
									ret := 0.789474 // buy
							if( Raw_Money_Flow > 30305.4 )
								ret := -0.352941
						if( Negative_Money_Flow > 44540.8 )
							if( Negative_Money_Flow <= 71073.7 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow > 71073.7 )
								if( Negative_Money_Flow_Sum <= 340821 )
									ret := 0.935484 // buy
								if( Negative_Money_Flow_Sum > 340821 )
									ret := 0.722222 // buy
					if( Negative_Money_Flow_Sum > 377733 )
						if( MFI_Low <= -4.56541 )
							if( Money_Flow_Ratio <= 0.132229 )
								if( Raw_Money_Flow <= 103318 )
									ret := 0.692308
								if( Raw_Money_Flow > 103318 )
									ret := -0.081081
							if( Money_Flow_Ratio > 0.132229 )
								if( Positive_Money_Flow_Sum <= 69906.2 )
									ret := -0.243243
								if( Positive_Money_Flow_Sum > 69906.2 )
									ret := 0.203704
						if( MFI_Low > -4.56541 )
							ret := 0.920000 // buy
			if( Negative_Money_Flow_Sum > 710326 )
				if( MFI_High <= -77.2858 )
					if( Raw_Money_Flow <= 69908.5 )
						if( Negative_Money_Flow_Sum <= 2.34064e+07 )
							if( Money_Flow_Ratio <= 0.010314 )
								if( Negative_Money_Flow_Sum <= 1.3045e+07 )
									ret := -0.230769
								if( Negative_Money_Flow_Sum > 1.3045e+07 )
									ret := 0.125000
							if( Money_Flow_Ratio > 0.010314 )
								if( Negative_Money_Flow <= 2668.73 )
									ret := -0.125000
								if( Negative_Money_Flow > 2668.73 )
									ret := 0.403846
						if( Negative_Money_Flow_Sum > 2.34064e+07 )
							if( Negative_Money_Flow_Sum <= 2.54343e+07 )
								ret := 0.923077 // buy
							if( Negative_Money_Flow_Sum > 2.54343e+07 )
								ret := 0.090909
					if( Raw_Money_Flow > 69908.5 )
						if( MFI <= 2.62117 )
							if( Negative_Money_Flow <= 697374 )
								if( Typical_Price <= 16.1986 )
									ret := 0.166667
								if( Typical_Price > 16.1986 )
									ret := -0.550847
							if( Negative_Money_Flow > 697374 )
								if( Negative_Money_Flow <= 851688 )
									ret := 0.333333
								if( Negative_Money_Flow > 851688 )
									ret := -0.245161
						if( MFI > 2.62117 )
							ret := -0.800000 // sell
				if( MFI_High > -77.2858 )
					if( Negative_Money_Flow_Sum <= 1.54388e+07 )
						if( Negative_Money_Flow <= 6.62404e+06 )
							if( Negative_Money_Flow <= 3.64688e+06 )
								if( Money_Flow_Ratio <= 0.123196 )
									ret := 0.167760
								if( Money_Flow_Ratio > 0.123196 )
									ret := -0.013761
							if( Negative_Money_Flow > 3.64688e+06 )
								if( Negative_Money_Flow_Sum <= 6.5975e+06 )
									ret := 0.961538 // buy
								if( Negative_Money_Flow_Sum > 6.5975e+06 )
									ret := 0.571429
						if( Negative_Money_Flow > 6.62404e+06 )
							if( Negative_Money_Flow <= 7.63111e+06 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 7.63111e+06 )
								ret := -0.846154 // sell
					if( Negative_Money_Flow_Sum > 1.54388e+07 )
						if( Positive_Money_Flow_Sum <= 1.76613e+06 )
							if( Negative_Money_Flow_Sum <= 2.87518e+07 )
								if( Raw_Money_Flow <= 64718.6 )
									ret := 0.533333
								if( Raw_Money_Flow > 64718.6 )
									ret := 0.901961 // buy
							if( Negative_Money_Flow_Sum > 2.87518e+07 )
								ret := 0.000000
						if( Positive_Money_Flow_Sum > 1.76613e+06 )
							if( Raw_Money_Flow <= 2.9585e+06 )
								if( MFI_Low <= -5.85571 )
									ret := -0.106667
								if( MFI_Low > -5.85571 )
									ret := 0.468750
							if( Raw_Money_Flow > 2.9585e+06 )
								if( Typical_Price <= 21.9893 )
									ret := 0.860759 // buy
								if( Typical_Price > 21.9893 )
									ret := 0.230769
		if( MFI_High > -63.4882 )
			if( Negative_Money_Flow <= 35780.3 )
				if( Raw_Money_Flow <= 34249 )
					if( Positive_Money_Flow_Sum <= 1.93429e+07 )
						if( Positive_Money_Flow_Sum <= 34644.8 )
							if( Negative_Money_Flow_Sum <= 38955.7 )
								if( MFI <= 58.4964 )
									ret := -0.247126
								if( MFI > 58.4964 )
									ret := 0.333333
							if( Negative_Money_Flow_Sum > 38955.7 )
								if( Raw_Money_Flow <= 17492.1 )
									ret := 0.337615
								if( Raw_Money_Flow > 17492.1 )
									ret := 0.731343 // buy
						if( Positive_Money_Flow_Sum > 34644.8 )
							if( Negative_Money_Flow_Sum <= 39271.9 )
								if( Money_Flow_Ratio <= 1.06391 )
									ret := -0.473684
								if( Money_Flow_Ratio > 1.06391 )
									ret := 0.297481
							if( Negative_Money_Flow_Sum > 39271.9 )
								if( MFI_Low <= 44.2008 )
									ret := 0.164119
								if( MFI_Low > 44.2008 )
									ret := 0.102591
					if( Positive_Money_Flow_Sum > 1.93429e+07 )
						if( MFI_Low <= 54.6471 )
							if( Positive_Money_Flow_Sum <= 2.14618e+07 )
								ret := 0.631579
							if( Positive_Money_Flow_Sum > 2.14618e+07 )
								ret := -0.074074
						if( MFI_Low > 54.6471 )
							if( MFI_High <= 3.1551 )
								if( Negative_Money_Flow_Sum <= 8.13753e+06 )
									ret := 0.853659 // buy
								if( Negative_Money_Flow_Sum > 8.13753e+06 )
									ret := 0.222222
							if( MFI_High > 3.1551 )
								if( Negative_Money_Flow <= 2014.29 )
									ret := 0.157895
								if( Negative_Money_Flow > 2014.29 )
									ret := 0.483871
				if( Raw_Money_Flow > 34249 )
					if( MFI_High <= -23.5184 )
						if( Positive_Money_Flow_Sum <= 45974.8 )
							if( MFI_Low <= 13.842 )
								ret := 0.333333
							if( MFI_Low > 13.842 )
								ret := 0.875000 // buy
						if( Positive_Money_Flow_Sum > 45974.8 )
							if( MFI_High <= -41.8089 )
								if( Negative_Money_Flow <= 1634.02 )
									ret := -0.096774
								if( Negative_Money_Flow > 1634.02 )
									ret := 0.303030
							if( MFI_High > -41.8089 )
								if( Raw_Money_Flow <= 104370 )
									ret := -0.471264
								if( Raw_Money_Flow > 104370 )
									ret := -0.119403
					if( MFI_High > -23.5184 )
						if( Positive_Money_Flow_Sum <= 93859 )
							ret := -0.600000
						if( Positive_Money_Flow_Sum > 93859 )
							if( Money_Flow_Ratio <= 6.08319 )
								if( Raw_Money_Flow <= 34863 )
									ret := -0.333333
								if( Raw_Money_Flow > 34863 )
									ret := 0.131965
							if( Money_Flow_Ratio > 6.08319 )
								if( Typical_Price <= 21.07 )
									ret := 0.086957
								if( Typical_Price > 21.07 )
									ret := -0.631579
			if( Negative_Money_Flow > 35780.3 )
				if( Money_Flow_Ratio <= 0.902457 )
					if( Negative_Money_Flow_Sum <= 3.1698e+07 )
						if( Typical_Price <= 14.2258 )
							if( Positive_Money_Flow_Sum <= 2.45437e+06 )
								if( Typical_Price <= 13.7317 )
									ret := 0.105263
								if( Typical_Price > 13.7317 )
									ret := 0.634146
							if( Positive_Money_Flow_Sum > 2.45437e+06 )
								if( MFI_Low <= 23.9163 )
									ret := 0.000000
								if( MFI_Low > 23.9163 )
									ret := -0.818182 // sell
						if( Typical_Price > 14.2258 )
							if( Negative_Money_Flow <= 481558 )
								if( MFI_Low <= 27.2326 )
									ret := -0.053038
								if( MFI_Low > 27.2326 )
									ret := -0.449541
							if( Negative_Money_Flow > 481558 )
								if( MFI_Low <= 22.8628 )
									ret := 0.058496
								if( MFI_Low > 22.8628 )
									ret := -0.083135
					if( Negative_Money_Flow_Sum > 3.1698e+07 )
						if( Negative_Money_Flow_Sum <= 5.5111e+07 )
							if( MFI <= 30.8654 )
								if( Positive_Money_Flow_Sum <= 1.34383e+07 )
									ret := 0.700000 // buy
								if( Positive_Money_Flow_Sum > 1.34383e+07 )
									ret := 0.962264 // buy
							if( MFI > 30.8654 )
								ret := 0.181818
						if( Negative_Money_Flow_Sum > 5.5111e+07 )
							ret := -0.200000
				if( Money_Flow_Ratio > 0.902457 )
					if( Negative_Money_Flow_Sum <= 8.81624e+06 )
						if( Positive_Money_Flow_Sum <= 480091 )
							if( MFI_High <= -11.6592 )
								if( Raw_Money_Flow <= 106239 )
									ret := 0.346821
								if( Raw_Money_Flow > 106239 )
									ret := 0.786885 // buy
							if( MFI_High > -11.6592 )
								if( MFI_Low <= 54.5618 )
									ret := -0.394737
								if( MFI_Low > 54.5618 )
									ret := 0.277778
						if( Positive_Money_Flow_Sum > 480091 )
							if( Positive_Money_Flow_Sum <= 1.70495e+07 )
								if( MFI_Low <= 29.8395 )
									ret := 0.131054
								if( MFI_Low > 29.8395 )
									ret := -0.016803
							if( Positive_Money_Flow_Sum > 1.70495e+07 )
								if( Negative_Money_Flow <= 1.90092e+06 )
									ret := 0.662162
								if( Negative_Money_Flow > 1.90092e+06 )
									ret := -0.230769
					if( Negative_Money_Flow_Sum > 8.81624e+06 )
						if( Raw_Money_Flow <= 1.5076e+06 )
							if( Positive_Money_Flow_Sum <= 1.12825e+07 )
								if( Positive_Money_Flow_Sum <= 1.02449e+07 )
									ret := 0.564103
								if( Positive_Money_Flow_Sum > 1.02449e+07 )
									ret := -0.360000
							if( Positive_Money_Flow_Sum > 1.12825e+07 )
								if( MFI <= 56.6378 )
									ret := 0.614286
								if( MFI > 56.6378 )
									ret := 0.833333 // buy
						if( Raw_Money_Flow > 1.5076e+06 )
							if( Positive_Money_Flow_Sum <= 5.03257e+07 )
								if( MFI_Low <= 46.2252 )
									ret := 0.078652
								if( MFI_Low > 46.2252 )
									ret := 0.757143 // buy
							if( Positive_Money_Flow_Sum > 5.03257e+07 )
								ret := -0.769231 // sell
	if( Positive_Money_Flow > 1.05614 )
		if( Positive_Money_Flow <= 163443 )
			if( Positive_Money_Flow_Sum <= 919271 )
				if( MFI_High <= -49.7094 )
					if( MFI_High <= -78.8287 )
						if( Typical_Price <= 17.2803 )
							if( MFI <= 0.936996 )
								if( Negative_Money_Flow_Sum <= 1.70549e+07 )
									ret := -0.416667
								if( Negative_Money_Flow_Sum > 1.70549e+07 )
									ret := 0.000000
							if( MFI > 0.936996 )
								ret := 0.666667
						if( Typical_Price > 17.2803 )
							if( Negative_Money_Flow_Sum <= 1.34518e+07 )
								if( Negative_Money_Flow <= 188.669 )
									ret := 0.083333
								if( Negative_Money_Flow > 188.669 )
									ret := 0.800000 // buy
							if( Negative_Money_Flow_Sum > 1.34518e+07 )
								if( Raw_Money_Flow <= 24138.4 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 24138.4 )
									ret := 0.923077 // buy
					if( MFI_High > -78.8287 )
						if( MFI_High <= -53.687 )
							if( Positive_Money_Flow_Sum <= 24106.2 )
								if( Raw_Money_Flow <= 9032.91 )
									ret := 0.442857
								if( Raw_Money_Flow > 9032.91 )
									ret := -0.214286
							if( Positive_Money_Flow_Sum > 24106.2 )
								if( Positive_Money_Flow_Sum <= 787181 )
									ret := -0.111657
								if( Positive_Money_Flow_Sum > 787181 )
									ret := 0.329114
						if( MFI_High > -53.687 )
							if( Typical_Price <= 14.6274 )
								if( Negative_Money_Flow_Sum <= 361449 )
									ret := 0.354839
								if( Negative_Money_Flow_Sum > 361449 )
									ret := 0.951220 // buy
							if( Typical_Price > 14.6274 )
								if( Money_Flow_Ratio <= 0.364751 )
									ret := 0.540541
								if( Money_Flow_Ratio > 0.364751 )
									ret := 0.029668
				if( MFI_High > -49.7094 )
					if( Negative_Money_Flow <= 3.74859 )
						if( Typical_Price <= 13.937 )
							if( MFI_Low <= 38.5082 )
								if( Negative_Money_Flow_Sum <= 312787 )
									ret := 0.567568
								if( Negative_Money_Flow_Sum > 312787 )
									ret := 1.000000 // buy
							if( MFI_Low > 38.5082 )
								ret := -0.352941
						if( Typical_Price > 13.937 )
							if( Raw_Money_Flow <= 29597.5 )
								if( MFI_Low <= 27.6528 )
									ret := -0.196843
								if( MFI_Low > 27.6528 )
									ret := -0.304843
							if( Raw_Money_Flow > 29597.5 )
								if( MFI <= 69.9392 )
									ret := -0.100321
								if( MFI > 69.9392 )
									ret := -0.320427
					if( Negative_Money_Flow > 3.74859 )
						if( Negative_Money_Flow <= 2381.54 )
							if( Positive_Money_Flow_Sum <= 484435 )
								if( Money_Flow_Ratio <= 0.883116 )
									ret := -0.093923
								if( Money_Flow_Ratio > 0.883116 )
									ret := 0.316159
							if( Positive_Money_Flow_Sum > 484435 )
								if( Negative_Money_Flow_Sum <= 229310 )
									ret := -0.904762 // sell
								if( Negative_Money_Flow_Sum > 229310 )
									ret := -0.333333
						if( Negative_Money_Flow > 2381.54 )
							if( Negative_Money_Flow <= 6062.3 )
								if( Typical_Price <= 16.6992 )
									ret := -0.535714
								if( Typical_Price > 16.6992 )
									ret := -0.133603
							if( Negative_Money_Flow > 6062.3 )
								if( Positive_Money_Flow_Sum <= 806527 )
									ret := 0.122807
								if( Positive_Money_Flow_Sum > 806527 )
									ret := -0.708333 // sell
			if( Positive_Money_Flow_Sum > 919271 )
				if( Raw_Money_Flow <= 140108 )
					if( Negative_Money_Flow <= 36527 )
						if( Positive_Money_Flow_Sum <= 3.7583e+06 )
							if( Positive_Money_Flow_Sum <= 3.66579e+06 )
								if( MFI_High <= -34.0347 )
									ret := -0.139497
								if( MFI_High > -34.0347 )
									ret := 0.036026
							if( Positive_Money_Flow_Sum > 3.66579e+06 )
								if( Positive_Money_Flow_Sum <= 3.70944e+06 )
									ret := 0.821429 // buy
								if( Positive_Money_Flow_Sum > 3.70944e+06 )
									ret := 0.384615
						if( Positive_Money_Flow_Sum > 3.7583e+06 )
							if( Money_Flow_Ratio <= 0.122149 )
								if( MFI_High <= -73.22 )
									ret := 1.000000 // buy
								if( MFI_High > -73.22 )
									ret := 0.666667
							if( Money_Flow_Ratio > 0.122149 )
								if( MFI_Low <= 5.33538 )
									ret := -0.550725
								if( MFI_Low > 5.33538 )
									ret := -0.139241
					if( Negative_Money_Flow > 36527 )
						if( MFI_Low <= 68.2619 )
							if( Money_Flow_Ratio <= 3.66146 )
								if( Raw_Money_Flow <= 59645.3 )
									ret := -0.142857
								if( Raw_Money_Flow > 59645.3 )
									ret := 0.235955
							if( Money_Flow_Ratio > 3.66146 )
								if( Raw_Money_Flow <= 72417.8 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 72417.8 )
									ret := 0.619048
						if( MFI_Low > 68.2619 )
							ret := -0.500000
				if( Raw_Money_Flow > 140108 )
					if( Typical_Price <= 16.8254 )
						if( Money_Flow_Ratio <= 1.04645 )
							if( Typical_Price <= 15.1808 )
								if( Money_Flow_Ratio <= 0.526451 )
									ret := -0.384615
								if( Money_Flow_Ratio > 0.526451 )
									ret := -0.809524 // sell
							if( Typical_Price > 15.1808 )
								if( Typical_Price <= 15.3601 )
									ret := 0.312500
								if( Typical_Price > 15.3601 )
									ret := -0.219409
						if( Money_Flow_Ratio > 1.04645 )
							if( Positive_Money_Flow <= 32062.4 )
								if( MFI_Low <= 51.4551 )
									ret := 0.333333
								if( MFI_Low > 51.4551 )
									ret := 0.923077 // buy
							if( Positive_Money_Flow > 32062.4 )
								if( Positive_Money_Flow <= 79294.2 )
									ret := -0.777778 // sell
								if( Positive_Money_Flow > 79294.2 )
									ret := 0.109890
					if( Typical_Price > 16.8254 )
						if( Raw_Money_Flow <= 150592 )
							if( Typical_Price <= 19.6952 )
								if( MFI_Low <= 46.6553 )
									ret := -0.337931
								if( MFI_Low > 46.6553 )
									ret := -0.686747
							if( Typical_Price > 19.6952 )
								if( MFI_High <= -48.8057 )
									ret := 0.538462
								if( MFI_High > -48.8057 )
									ret := -0.269231
						if( Raw_Money_Flow > 150592 )
							if( Positive_Money_Flow <= 1732.98 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow > 1732.98 )
								if( Money_Flow_Ratio <= 7.10959 )
									ret := -0.080940
								if( Money_Flow_Ratio > 7.10959 )
									ret := -0.609756
		if( Positive_Money_Flow > 163443 )
			if( Negative_Money_Flow_Sum <= 2.76413e+07 )
				if( Positive_Money_Flow_Sum <= 3.03303e+07 )
					if( Raw_Money_Flow <= 647551 )
						if( Negative_Money_Flow_Sum <= 1.54812e+06 )
							if( Typical_Price <= 17.0616 )
								if( Money_Flow_Ratio <= 20.6799 )
									ret := 0.106745
								if( Money_Flow_Ratio > 20.6799 )
									ret := 0.662500
							if( Typical_Price > 17.0616 )
								if( Negative_Money_Flow_Sum <= 684238 )
									ret := -0.207650
								if( Negative_Money_Flow_Sum > 684238 )
									ret := 0.036145
						if( Negative_Money_Flow_Sum > 1.54812e+06 )
							if( Negative_Money_Flow <= 45.5032 )
								if( MFI <= 12.5782 )
									ret := 0.321429
								if( MFI > 12.5782 )
									ret := -0.049703
							if( Negative_Money_Flow > 45.5032 )
								if( Negative_Money_Flow <= 1967.39 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 1967.39 )
									ret := 0.200000
					if( Raw_Money_Flow > 647551 )
						if( Typical_Price <= 22.8443 )
							if( MFI_Low <= -0.398425 )
								if( Money_Flow_Ratio <= 0.139207 )
									ret := -0.215686
								if( Money_Flow_Ratio > 0.139207 )
									ret := 0.511111
							if( MFI_Low > -0.398425 )
								if( MFI_High <= -46.8189 )
									ret := -0.151452
								if( MFI_High > -46.8189 )
									ret := 0.098437
						if( Typical_Price > 22.8443 )
							if( Positive_Money_Flow_Sum <= 2.60935e+07 )
								if( Negative_Money_Flow_Sum <= 3.85937e+06 )
									ret := -0.049231
								if( Negative_Money_Flow_Sum > 3.85937e+06 )
									ret := -0.405634
							if( Positive_Money_Flow_Sum > 2.60935e+07 )
								ret := 1.000000 // buy
				if( Positive_Money_Flow_Sum > 3.03303e+07 )
					if( MFI_High <= 9.9251 )
						if( Negative_Money_Flow <= 4862.12 )
							if( Money_Flow_Ratio <= 2.68885 )
								if( MFI_Low <= 42.7802 )
									ret := -0.692308
								if( MFI_Low > 42.7802 )
									ret := -0.978261 // sell
							if( Money_Flow_Ratio > 2.68885 )
								if( Money_Flow_Ratio <= 5.50737 )
									ret := -0.530612
								if( Money_Flow_Ratio > 5.50737 )
									ret := -0.842105 // sell
						if( Negative_Money_Flow > 4862.12 )
							if( Positive_Money_Flow_Sum <= 4.23041e+07 )
								if( Typical_Price <= 17.9686 )
									ret := -0.538462
								if( Typical_Price > 17.9686 )
									ret := 0.538462
							if( Positive_Money_Flow_Sum > 4.23041e+07 )
								if( Raw_Money_Flow <= 1.99096e+06 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 1.99096e+06 )
									ret := -0.636364
					if( MFI_High > 9.9251 )
						if( Raw_Money_Flow <= 3.42179e+06 )
							if( Raw_Money_Flow <= 2.09855e+06 )
								ret := 0.090909
							if( Raw_Money_Flow > 2.09855e+06 )
								ret := 0.947368 // buy
						if( Raw_Money_Flow > 3.42179e+06 )
							ret := -0.687500
			if( Negative_Money_Flow_Sum > 2.76413e+07 )
				if( MFI_High <= -66.3864 )
					ret := 0.500000
				if( MFI_High > -66.3864 )
					if( Typical_Price <= 20.6608 )
						if( Negative_Money_Flow <= 172515 )
							if( Positive_Money_Flow_Sum <= 1.392e+07 )
								ret := 0.062500
							if( Positive_Money_Flow_Sum > 1.392e+07 )
								if( Negative_Money_Flow_Sum <= 3.94397e+07 )
									ret := -0.133333
								if( Negative_Money_Flow_Sum > 3.94397e+07 )
									ret := -0.700000 // sell
						if( Negative_Money_Flow > 172515 )
							ret := -1.000000 // sell
					if( Typical_Price > 20.6608 )
						if( Raw_Money_Flow <= 2.32828e+06 )
							ret := -1.000000 // sell
						if( Raw_Money_Flow > 2.32828e+06 )
							if( Money_Flow_Ratio <= 0.213437 )
								ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.213437 )
								ret := -0.529412
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_U_1Min_e06cbef6(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


